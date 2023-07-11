package src;

public class  HocSinh extends Nguoi {
    private String lop;
    private String hocluc;

    public HocSinh(int MaSo, String ten, int tuoi, String gioiTinh, String lop, String hocluc) {
        super(MaSo, ten, tuoi, gioiTinh);
        this.lop = lop;
        this.hocluc = hocluc;
    }

    public String getLop() {
        return lop;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    @Override
    public String toString() {
        return super.toString() + " HocSinh [lop=" + lop + ", hocluc=" + hocluc + "]";
    }

    

    
    
}
