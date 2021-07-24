package lopdoituong;

import KieuDuLieu.SVPoly;

public class QuanLySinhVien {
    public static void main(String[] args) {
        //SVPoly.hoTen = "Nguyên Hoàng Duy";
        SVPoly SV1 = new SVPoly("Nguyễn Hoàng Duy",10); //tạo đối tượng
        SV1.xuat();
        SVPoly SV2 = new SVPoly("Nguyễn Hoàng Duy");
        SV2.diem = 9;
        SVPoly SV3 = new SVPoly(8);
        SV3.hoTen = "Nguyễn Hoàng Duy";
    }
}
