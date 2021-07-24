package ctyrongviet;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public TruongPhong() {}
    public TruongPhong(String manv, String hoten, double luong, double trachNhiem) {
        super(manv, hoten, "Trưởng Phòng", luong);
        this.trachNhiem = trachNhiem;
    }
    public void nhap(Scanner nhap){
        super.nhap(nhap);
        System.out.println("Lương trách nhiệm: ");
        trachNhiem = nhap.nextDouble();
        nhap.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("\nLuong trach nhiem: %f",trachNhiem);
    }
    public double getTrachNhiem() {
        return trachNhiem;
    }
    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
}
