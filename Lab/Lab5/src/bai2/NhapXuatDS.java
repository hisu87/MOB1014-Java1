package bai2;

import static ThuVien.NhapDuLieu.nhapInt;
import static ThuVien.NhapDuLieu.nhapString;
import java.util.ArrayList;

public class NhapXuatDS {
    public static void nhap(ArrayList<String> dsTen){
        int n = nhapInt("Nhap so sinh vien: ");
        for (int i=0;i<n;i++){
            dsTen.add(nhapString("Nhap ten: "));
        }
    }
    public static void xuat(ArrayList<String> dsTen){
        for (int i=0;i<dsTen.size();i++){
            System.out.println(dsTen.get(i));
        }
    }
}
