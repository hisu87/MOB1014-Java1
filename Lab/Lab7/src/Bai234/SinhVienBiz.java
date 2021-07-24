package Bai234;

public class SinhVienBiz extends SinhVienPoly{
    Double diemMarketing, diemSales;

    public SinhVienBiz() {
    }
    public SinhVienBiz(Double diemMarketing, Double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    Double getDiem() {
        return (this.diemMarketing*2 + this.diemSales)/3;
    }
}
