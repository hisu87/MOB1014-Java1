package SuaXoa;

import java.util.ArrayList;
import KieuDL.NhanVien;
import static Nhap.BanPhim.nhapSTRING;

public class Xoa{
    public static void xoaTheoMa(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Hãy nhập mã cần xóa: ");
        int i=0;
        for(i=0;i<ds.size();i++){
           if(ds.get(i).getMa().equalsIgnoreCase(ma)) break;
        }
        ds.remove(i);
    }
    public static void suaNV(ArrayList<NhanVien> ds){
    }
    public static void suaTP(ArrayList<NhanVien> ds){
    }
    public static void suaTT(ArrayList<NhanVien> ds){
    }
}
