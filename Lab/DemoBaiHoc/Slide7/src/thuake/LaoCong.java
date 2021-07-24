package thuake;

public class LaoCong extends NhanVien{
    double soGioLamViec;

    public LaoCong(double soGioLamViec, String hoTen, double luong) {
        super(hoTen, luong);
        this.soGioLamViec = soGioLamViec;
    }
    
    @Override
    void xuat(){
        super.xuat();
        System.out.println("So gio lam viec: "+soGioLamViec);
    }
}
