package KieuDL;
public class TruongPhong extends NhanVien{
    double luongTrachNhiem;

    public TruongPhong(double luongTrachNhiem, String ma, String hoTen, double luong) {
        super(ma, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }
    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Lương trách nhiệm: "+ luongTrachNhiem);
    }
    @Override
    public double getThuNhap(){
        return luong + luongTrachNhiem;
    }
}
