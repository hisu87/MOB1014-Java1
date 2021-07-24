package thuake;

public class NhanVien {
    String hoTen;
    double luong;

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }
    
    void xuat(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Luong: "+luong);
    }
}
