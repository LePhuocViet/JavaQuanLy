package src;

public class Nguoi {
    public int MaSo;
    public String Ten;
    public int Tuoi;
    public String GioiTinh;
    
    public Nguoi(int maSo ,String ten, int tuoi, String gioiTinh) {
        Ten = ten;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
        MaSo = maSo;
    }
    public void setMaSo(int maSo) {
        MaSo = maSo;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }
    

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getTen() {
        return Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }
     public int getMaSo() {
        return MaSo;
    }
    @Override
    public String toString() {
        return "Nguoi [MaSo=" + MaSo + ", Ten=" + Ten + ", Tuoi=" + Tuoi + ", GioiTinh=" + GioiTinh + "]";
    }
  
   
    
    
    
}
