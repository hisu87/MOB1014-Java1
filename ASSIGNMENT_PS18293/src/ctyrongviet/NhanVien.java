package ctyrongviet;

import java.util.Scanner;

public class NhanVien {
    String manv,hoten,loai;
    double luong;

    public NhanVien() {
    }
    public NhanVien(String manv, String hoten, String loai, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.loai = loai;
        this.luong = luong;
    }
    public void nhap(Scanner nhap){
        System.out.print("Mã NV: ");
        this.manv = nhap.nextLine();
        System.out.print("Họ tên: ");
        this.hoten = nhap.nextLine();
        System.out.print("Lương: ");
        this.luong = nhap.nextDouble();
        nhap.nextLine();
    }
    public void xuat(){
        System.out.printf("Ma NV: %s",manv);
        System.out.printf("\nHo ten: %s",hoten);
        System.out.printf("\nLoai: %s",loai);
        System.out.printf("\nLuong: %s",luong);
    }
    public String getManv() {
        return manv;
    }
    public void setManv(String manv) {
        this.manv = manv;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getLoai() {
        return loai;
    }
    public void setLoai(String loai) {
        this.loai = loai;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
}
