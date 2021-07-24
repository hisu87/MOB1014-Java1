package SapXep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import KieuDL.NhanVien;

public class SapXep {
    public static void sapXepTen(ArrayList<NhanVien> ds){
        Comparator<NhanVien> cmp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(ds,cmp);
        System.out.println("Đã sắp xếp xong!");
    }
    public static void sapXepThuNhap(ArrayList<NhanVien> ds){
        Comparator<NhanVien> cmp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getThuNhap()> o2.getThuNhap()? 1: -1;
            }
        };
        Collections.sort(ds,cmp);
        System.out.println("Đã sắp xếp xong!");
    }
}
