package chayct;

import static ThuVien.NhapDuLieu.nhapInt;
import static ThuVien.NhapDuLieu.nhapString;
import static ThuVien.NhapDuLieu.nhapDouble;
import bai1.SanPham;

public class QLSP {
    public static void main(String[] args) {
        int n = nhapInt("Số phần tử mảng: ");
        SanPham[] dsSP = new SanPham[n];
        for(int i=0;i<n;i++){
            String tenSP = nhapString("Tên sản phẩm: ");
            double donGia = nhapDouble("Đơn giá: ");
            double giamGia = nhapDouble("Giảm giá: ");
            SanPham SP = new SanPham(tenSP,donGia,giamGia);
            dsSP[i] = SP;
        }
        for(int i=0;i<n;i++){
            dsSP[i].xuat();
        }
    }
}
