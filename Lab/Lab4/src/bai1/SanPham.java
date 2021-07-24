package bai1;

public class SanPham {
    // khai báo thuộc tính
    public String tenSP;
    public double donGia;
    public double giamGia;

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    // khai báo các phương thức
    public double getThueThuNhap(){
        return 0.1*donGia;
    }
    public void nhap(String tenSP, double donGia, double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public void xuat(){
        System.out.println("Kết quả xuất ra là:");
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Giảm giá: "+giamGia);
        System.out.println("Thuế thu nhập: "+getThueThuNhap());
    }
}
