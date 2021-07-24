package thuake;

import java.util.ArrayList;

public class TinhDaHinh {
    public static void main(String[] args) {
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        NhanVien nv = new NhanVien("A",1);
        ds.add(nv);
        NhanVien tp = new TruongPhong(2,"B",3);
        ds.add(tp);
        NhanVien lc = new LaoCong(4,"C",5);
        ds.add(lc);
        //Xuat tat ca
        for (NhanVien x : ds) {
            x.xuat();
        }
        System.out.println("==================");
        //Xuat Truong Phong
        for (NhanVien x : ds) {
            if(x instanceof TruongPhong){
                x.xuat();
            }
        }
        System.out.println("==================");
        for (NhanVien x : ds) {
            if(x instanceof LaoCong){
                x.xuat();
            }
        }
    }
}
