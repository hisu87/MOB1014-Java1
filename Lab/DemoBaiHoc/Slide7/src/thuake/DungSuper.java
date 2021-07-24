package thuake;

public class DungSuper {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("A",1);
        TruongPhong tp = new TruongPhong(2,"B",3);
        LaoCong lc = new LaoCong(4,"C",5);
        
        nv.xuat();
        tp.xuat();
        lc.xuat();
    }
}
