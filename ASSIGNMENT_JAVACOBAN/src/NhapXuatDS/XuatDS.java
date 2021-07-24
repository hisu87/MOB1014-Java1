package NhapXuatDS;

import java.util.ArrayList;
import KieuDL.NhanVien;
import static SapXep.SapXep.sapXepThuNhap;
import static Nhap.BanPhim.nhapDOUBLE;
import static Nhap.BanPhim.nhapSTRING;

public class XuatDS {
    public static void xuatHet(ArrayList<NhanVien> ds){
        for(NhanVien x : ds ) x.xuat(); 
    }
    public static void xuatTheoMa(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Nhập mã: ");
        for(NhanVien x : ds){
            if(x.getMa().equalsIgnoreCase(ma)) x.xuat();
        }
    }
    public static void xuatTheoKhoangLuong(ArrayList<NhanVien> ds ){
        double min = nhapDOUBLE("Nhập lương thấp nhất: ");
        double max = nhapDOUBLE("Nhap lương cao nhất: ");
        for(NhanVien x : ds){
            if(x.getLuong()>= min && x.getLuong()<= max) x.xuat();
        }
    }
    public static void xuat5CaoNhat(ArrayList<NhanVien> ds){
        sapXepThuNhap(ds);
        for(int i=0;i<5;i++) ds.get(i).xuat();
    }
}
