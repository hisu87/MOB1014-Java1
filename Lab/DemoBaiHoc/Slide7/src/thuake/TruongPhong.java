package thuake;

public class TruongPhong extends NhanVien{
    double luongTrachNhiem;

    public TruongPhong(double luongTrachNhiem, String hoTen, double luong) {
        super(hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
    @Override
    void xuat(){
        super.xuat();
        System.out.println("Luong trach nhiem: "+luongTrachNhiem);
    }
}
