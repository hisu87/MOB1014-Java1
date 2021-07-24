package ctyrongviet;

import java.util.Scanner;

public class TiepThi extends NhanVien{
    private double danhSo;
    private double hueHong;

    public TiepThi() {}
    public TiepThi(String manv, String hoten, double luong, double danhSo, double hueHong) {
        super(manv, hoten, "Tiếp Thị", luong);
        this.danhSo = danhSo;
        this.hueHong = hueHong;
    }
    public TiepThi(String manv, String hoten, String loai, double luong) {
        super(manv, hoten, loai, luong);
    }
    public void nhap(Scanner nhap){
        super.nhap(nhap);
        System.out.println("Doanh số: ");
        danhSo = nhap.nextDouble();
        System.out.println("Huê Hồng: ");
        hueHong = nhap.nextDouble();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("\nDanh so: %f",danhSo);
        System.out.printf("\nHue hong: %f",hueHong);
    }
    public double getDanhSo() {
        return danhSo;
    }
    public void setDanhSo(double danhSo) {
        this.danhSo = danhSo;
    }
    public double getHueHong() {
        return hueHong;
    }
    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
}
