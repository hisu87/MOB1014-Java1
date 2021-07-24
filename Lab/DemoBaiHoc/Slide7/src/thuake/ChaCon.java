package thuake;

public class ChaCon {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("A",1);
        nv.xuat();
        TruongPhong tp = new TruongPhong(2,"B",3);
        tp.xuat();
        LaoCong lc = new LaoCong(4,"C",5);
        lc.xuat();
    }
}
