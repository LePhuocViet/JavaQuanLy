package src;

public class GiaoVien extends Nguoi{
    private String ChucVu;
    private double Luong;
    

    public GiaoVien(int MaSo, String ten, int tuoi, String gioiTinh, String chucVu, double luong) {
        super(MaSo, ten, tuoi, gioiTinh);
        ChucVu = chucVu;
        Luong = luong;
    }

    public void setChucVu(String chucVu) {
        ChucVu = chucVu;
    }

    public void setLuong(double luong) {
        Luong = luong;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public double getLuong() {
        return Luong;
    }

    @Override
    public String toString() {
        return super.toString() + " GiaoVien [ChucVu=" + ChucVu + ", Luong=" + Luong + "]";
    }

   
    
    
    
}
