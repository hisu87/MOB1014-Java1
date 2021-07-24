package lopdoituong;

import KieuDuLieu.SVPoly;
import ThuVien.NhapDuLieu;

public class MangDoiTuong {
    public static void main(String[] args) {
        int n = NhapDuLieu.nhapInt("Số phần tử mảng: ");
        SVPoly[] dssv = new SVPoly[n];
        for(int i=0;i<n;i++){
            String hoTen = NhapDuLieu.nhapString("Họ Tên: ");
            double diem = NhapDuLieu.nhapDouble("Điểm: ");
            SVPoly sv = new SVPoly(hoTen,diem);
            dssv[i] = sv;
        }
        for(int i=0;i<n;i++){
            dssv[i].xuat();
        }
    }
}
