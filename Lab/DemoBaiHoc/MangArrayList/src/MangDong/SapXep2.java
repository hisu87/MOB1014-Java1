package MangDong;

import ThuVien.NhapDuLieu;
import ThuVien.SinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SapXep2 {
    public static void main(String[] args) {
        ArrayList<SinhVien> dssv = new ArrayList<>();
        // Nhap sinh vien
        int n = NhapDuLieu.nhapInt("Nhap so sinh vien: ");
        for (int i=0;i<n;i++){
            SinhVien sv = new SinhVien();
            sv.nhap(NhapDuLieu.nhapString("Ten: "),NhapDuLieu.nhapInt("Tuoi: "));
            dssv.add(sv);
        }
        // xuat
        System.out.println("============================");
        for (int i=0;i<dssv.size();i++){
            dssv.get(i).xuat();
        }
        // sap xep theo ten
        Comparator<SinhVien> cmp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.ten.compareTo(o2.ten);
            }
        };
        System.out.println("============================");
        Collections.sort(dssv,cmp);
        for (int i=0;i<dssv.size();i++){
            dssv.get(i).xuat();
        }
    }
}
