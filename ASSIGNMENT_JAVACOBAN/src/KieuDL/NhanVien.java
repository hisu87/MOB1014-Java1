package KieuDL;
public class NhanVien {
    String ma;
    String hoTen;
    double luong;

    public NhanVien(String ma, String hoTen, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public String getMa() {
        return ma;
    }
    public String getHoTen() {
        return hoTen;
    }
    public double getLuong() {
        return luong;
    }
    public void xuat(){
        System.out.println("Mã: "+ ma);
        System.out.println("Họ tên: "+ hoTen);
        System.out.println("Lương: "+ luong);
    }
    public double getThuNhap(){
        return luong;
    }
    public double thueThuNhap(){
        double soDu = getThuNhap()-9000000;
        if(soDu <0 ) return 0;
        else if(soDu < 15000000) return soDu*0.1;
             else return (soDu - 15000000)*0.12 + 6000000*0.1; 
    }
}
