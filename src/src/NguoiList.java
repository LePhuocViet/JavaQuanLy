package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NguoiList {
    private ArrayList<Nguoi> nguoilist;
    private ArrayList<HocSinh> hocsinh;
    private ArrayList<GiaoVien> giaovien;
        public NguoiList(){
        nguoilist = new ArrayList();
        hocsinh = new ArrayList();
        giaovien = new ArrayList();
    } 
    public NguoiList(ArrayList<Nguoi> nguoilist,ArrayList<HocSinh> hocsinh,ArrayList<GiaoVien> giaovien) {
            this.nguoilist = nguoilist;
            this.hocsinh = hocsinh;
            this.giaovien = giaovien;
       
        }
    public void readflie(){
        HocSinh hs;
        GiaoVien gv;
        Nguoi ng;
        try {
            Scanner v = new Scanner(new File("Student.txt"));
            while(v.hasNext()){
            int maso1 = v.nextInt();
            String ten1 = v.next();
            int tuoi1 = v.nextInt();
            String gioitinh1 = v.next();
            ng = new Nguoi(maso1,ten1,tuoi1,gioitinh1);
            nguoilist.add(ng);
            if(maso1 > 100){
                String chuvu1 = v.next();
                Double luong1 = v.nextDouble();
                gv = new GiaoVien(maso1, ten1, tuoi1, gioitinh1, chuvu1, luong1);
                giaovien.add(gv);
            } else if(maso1 <= 100){
                String lop1 = v.next();
                String hocluc1 = v.next();
                hs = new HocSinh(maso1, ten1, tuoi1, gioitinh1, lop1, hocluc1);
                hocsinh.add(hs);
            }
            }
            v.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
      
    public void xoanguoi(int maso){
        for(int i = 0; i < nguoilist.size();i++){
            Nguoi t = nguoilist.get(i);
            if(t.getMaSo() == maso){
            nguoilist.remove(t);break;
            }
        for(int j = 0; j < hocsinh.size();j++){
            Nguoi g = hocsinh.get(j);
            if(g.getMaSo() == maso){
            hocsinh.remove(g);break;
            }
        }
    }
    for(int f = 0; f < giaovien.size();f++){
            Nguoi h = giaovien.get(f);
            if(h.getMaSo() == maso){
            giaovien.remove(h);break;
            }
        }
}
    public String viewnguoi() {
        String s="Nguoi List\n--------------------\n";        
        for(Nguoi st:nguoilist) s+=st+"\n";
        return s;
    }
    public String viewhocsinh() {
        String s="HocSinh List\n--------------------\n";        
        for(HocSinh st:hocsinh) s+=st+"\n";
        return s;
    }
    public String viewgiaovien() {
        String s="GiaoVien List\n--------------------\n";        
        for(GiaoVien st:giaovien) s+=st+"\n";
        return s;
    }
}
