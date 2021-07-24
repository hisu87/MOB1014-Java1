package thuake;

public class EpLen {
    public static void main(String[] args) {
        TruongPhong tp = new TruongPhong(2,"A",3);
        //ep kieu ngam dinh
        NhanVien nv = tp;
        nv.xuat();
        nv = new LaoCong(4,"B",5);
        nv.xuat();
        //ep tuong minh
        nv = (NhanVien)tp;
        nv.xuat();
        ((NhanVien)tp).xuat();
    }
}
