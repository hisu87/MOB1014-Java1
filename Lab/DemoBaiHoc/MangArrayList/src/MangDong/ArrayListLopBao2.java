package MangDong;

import ThuVien.NhapDuLieu;
import java.util.ArrayList;

public class ArrayListLopBao2 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        // Nhap so phan tu
        int n = NhapDuLieu.nhapInt("Nhap so phan tu: ");
        // Nhap phan tu mang
        for (int i=0;i<n;i++){
            int s = NhapDuLieu.nhapInt("Nhap: ");
            str.add("");
        }
        for (int i=0;i<str.size();i++){
            System.out.println(str.get(i));
        }
    }
}
