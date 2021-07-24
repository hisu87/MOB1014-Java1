package SuaXoa;

import java.util.ArrayList;
import KieuDL.NhanVien;
import KieuDL.TiepThi;
import KieuDL.TruongPhong;
import static SuaXoa.TimNV.timTheoMa;
import static Nhap.BanPhim.nhapDOUBLE;
import static Nhap.BanPhim.nhapSTRING;

public class SuaTheoMa {
    public static void suaTen(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Nhập mã: ");
        String hoTen = nhapSTRING("Nhập tên: ");
        ds.get(timTheoMa(ds,ma)).setHoTen(hoTen);
    }
    public static void suaLuong(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Nhập mã: ");
        double luong = nhapDOUBLE("Nhập Lương: ");
        ds.get(timTheoMa(ds,ma)).setLuong(luong);
    }
    public static void suaLuongTrachNhiem(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Nhập mã: ");
        int i = timTheoMa(ds,ma);
        if(ds.get(i)instanceof TruongPhong){
            double luongTrachNhiem = nhapDOUBLE("Nhập lương trách nhiệm: ");
            ((TruongPhong)ds.get(i)).setLuong(luongTrachNhiem);
        }else System.out.println("Không phải là trưởng phòng");
    }
    public static void suaDoanhSoBanHang(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Nhập mã: ");
        int i = timTheoMa(ds,ma);
        if(ds.get(i)instanceof TiepThi){
            double doanhSoBanHang = nhapDOUBLE("Nhập lương trách nhiệm: ");
            ((TiepThi)ds.get(i)).setLuong(doanhSoBanHang);
        } System.out.println("Không phải là tiếp thị");
    }
    public static void suaTyLeHoaHong(ArrayList<NhanVien> ds){
        String ma = nhapSTRING("Nhập mã: ");
        if(ds.get(timTheoMa(ds,ma))instanceof TiepThi){
            double tyLeHoaHong = nhapDOUBLE("Tỷ lệ hoa hồng:  ");
            ds.get(timTheoMa(ds,ma)).setLuong(tyLeHoaHong);
        } else System.out.println("Không phải tiếp thị");
    }
}
