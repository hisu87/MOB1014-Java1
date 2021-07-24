package Bai2;

import ThuVien.NhapDuLieu;
import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private Double donGia;
    private String hang;

    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public Double getDonGia() {
        return donGia;
    }
    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    public String getHang() {
        return hang;
    }
    public void setHang(String hang) {
        this.hang = hang;
    }
    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        tenSP = NhapDuLieu.nhapString("Ten SP: ");
        donGia = NhapDuLieu.nhapDouble("Don gia: ");
        hang = NhapDuLieu.nhapString("Hang: ");
    }
    public void xuat() {
        System.out.printf("Ten SP: %s - Don gia: %f - Hang: %s\n",tenSP,donGia,hang);
    }
}
