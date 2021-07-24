package bai3;

import static ThuVien.NhapDuLieu.nhapDouble;
import static ThuVien.NhapDuLieu.nhapInt;
import static ThuVien.NhapDuLieu.nhapString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSP {
    static ArrayList<SanPham> list = new ArrayList<>();
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        int n = nhapInt("Nhap so san pham: ");
        for(int i=0;i<n;i++){
            String tenSP = nhapString("Ten san pham: ");
            double donGia = nhapDouble("Don gia: ");
            list.add(new SanPham(tenSP, donGia));
        }
    }
    public void xuat(){
        System.out.println("===========================");
        for (SanPham sanPham : list) {
            System.out.println(sanPham.getTenSP());
            System.out.println(sanPham.getDonGia());
        }
    }
    public void sapXep(){
        Collections.sort(list, (a,b)->(int)(a.getDonGia()-b.getDonGia()));
        System.out.println("Danh sach sau khi sap xep: ");
        xuat();
    }
    public void timKiem(){
        String ten = nhapString("Nhap ten can tim va xoa: ");
        SanPham found = null;
        for (SanPham sanPham : list) {
            if(sanPham.getTenSP().equals(ten)){
                found = sanPham;
                break;
            }
        }
        if(found!=null){
            list.remove(found);
            System.out.println("San pham da duoc xoa!");
        }else{
            System.out.println("Khong co san pham nay!");
        }
    }
    public void tinhTrungBinh(){
        double sum = 0;
        for (SanPham sanPham : list) {
            sum += sanPham.getDonGia();
        }
        double avg = sum/list.size();
        System.out.println("Gia trung binh cua cac san pham: "+avg);
    }
}
