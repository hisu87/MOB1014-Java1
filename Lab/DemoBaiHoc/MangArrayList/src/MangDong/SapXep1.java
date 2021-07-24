package MangDong;

import ThuVien.NhapDuLieu;
import java.util.ArrayList;
import java.util.Collections;

public class SapXep1 {
    public static void main(String[] args) {
        ArrayList<Integer> dsn = new ArrayList<>();
        int n = NhapDuLieu.nhapInt("Nhap so phan tu: ");
        for (int i=0;i<n;i++){
            dsn.add(NhapDuLieu.nhapInt("Nhap so: "));
        }
        System.out.println("==============================");
        //xuất
        for (int i=0;i<dsn.size();i++){
            System.out.println(dsn.get(i));
        }
        System.out.println("==============================");
        //sắp xếp
        Collections.sort(dsn);
        //xuất
        for (int i=0;i<dsn.size();i++){
            System.out.println(dsn.get(i));
        }
    }
}
