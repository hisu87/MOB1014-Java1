package KieuDL;
public class TiepThi extends NhanVien{
    double doanhSoBanHang;
    double tyLeHoaHong;

    public TiepThi(double doanhSoBanHang, double tyLeHoaHong, String ma, String hoTen, double luong) {
        super(ma, hoTen, luong);
        this.doanhSoBanHang = doanhSoBanHang;
        this.tyLeHoaHong = tyLeHoaHong;
    }
    public void setDoanhSoBanHang(double doanhSoBanHang) {
        this.doanhSoBanHang = doanhSoBanHang;
    }
    public void setTyLeHoaHong(double tyLeHoaHong) {
        this.tyLeHoaHong = tyLeHoaHong;
    }
    public double getDoanhSoBanHang() {
        return doanhSoBanHang;
    }
    public double getTyLeHoaHong() {
        return tyLeHoaHong;
    } 
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Doanh số bán hàng: "+ doanhSoBanHang);
        System.out.println("Tỷ lệ hoa hồng: "+ tyLeHoaHong);
    }
    @Override
    public double getThuNhap(){
        return luong + doanhSoBanHang*tyLeHoaHong;
    }
}
