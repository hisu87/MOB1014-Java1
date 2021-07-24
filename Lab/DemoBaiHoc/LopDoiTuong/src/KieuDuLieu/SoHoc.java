package KieuDuLieu;

public class SoHoc {
    public static int x = 2;
    public int y = 5;
    int tong(){
        return x+y;
    }
    public void xuat(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("Tổng = "+tong());
    }
}
