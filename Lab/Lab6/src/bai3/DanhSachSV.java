package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSV {
    private ArrayList<SinhVien> list = new ArrayList<>();
    
    public void nhap(){
        Scanner n = new Scanner(System.in);
        for (int i=0;i<2;i++) {
            SinhVien sv = new SinhVien();
            sv.nhap(n);
            list.add(sv);
        }
    }
    public void xuat(){
        System.out.println("========================");
        System.out.println("Danh sach sinh vien:");
        for (SinhVien sinhVien : list) {
            sinhVien.xuat();
        }
    }
}
