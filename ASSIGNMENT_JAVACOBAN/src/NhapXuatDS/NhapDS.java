package NhapXuatDS;

import java.util.ArrayList;
import KieuDL.NhanVien;
import KieuDL.TiepThi;
import KieuDL.TruongPhong;
import static Nhap.BanPhim.nhapDOUBLE;
import static Nhap.BanPhim.nhapSTRING;

public class NhapDS{
    public static void nhapNV(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Mã: ");
        String hoTen = nhapSTRING("Họ tên: ");
        double luong = nhapDOUBLE("Lương: ");
        NhanVien nv = new NhanVien(ma,hoTen,luong);
        ds.add(nv);
    }
    public static void nhapTP(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Mã: ");
        String hoTen = nhapSTRING("Họ tên: ");
        double luong = nhapDOUBLE("Lương: ");
        double luongTrachNhiem = nhapDOUBLE("Lương trách nhiệm: ");
        NhanVien nv = new TruongPhong(luongTrachNhiem,ma,hoTen,luong);
        ds.add(nv);
    }
    public static void nhapTT(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Mã: ");
        String hoTen = nhapSTRING("Họ tên: ");
        double luong = nhapDOUBLE("Lương: ");
        double doanhSoBanHang = nhapDOUBLE("Doanh số bán hàng:");
        double tyLeHoaHong = nhapDOUBLE("Tỷ lệ hoa hồng: ");
        NhanVien nv = new TiepThi(doanhSoBanHang,tyLeHoaHong,ma,hoTen,luong);
        ds.add(nv);
    }
}
