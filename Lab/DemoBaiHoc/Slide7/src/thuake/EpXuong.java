package thuake;

public class EpXuong {
    public static void main(String[] args) {
        NhanVien nv = new TruongPhong(2,"A",3);
        //TruongPhong tp = new TruongPhong(2,"A",3);
        TruongPhong tp = (TruongPhong)nv;
        tp.xuat();
        ((TruongPhong)nv).xuat();
    }
}
