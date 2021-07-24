package baitap;

public class SanPham {
    // khai báo thuộc tính
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public String getTenSP() {
        return this.tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public double getDonGia() {
        return this.donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return this.giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    // khai báo các phương thức
    private double getThueThuNhap(){
        return 0.1*donGia;
    }
    public void nhap(String tenSP, double donGia, double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public void xuat(){
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Giảm giá: "+giamGia);
        System.out.println("Thuế thu nhập: "+getThueThuNhap());
    }
}
