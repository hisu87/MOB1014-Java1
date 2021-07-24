package Bai2;

public class XPoly {
    public static double sum(double ... n) {
        double s=0;
        for (double tong : n) {
            s += tong;
        }
        return s;
    }
    public static double min(double ... n) {
        double m = n[0];
        for (double item : n) {
            m = Math.min(m, item);
        }
        return m;
    }
    public static double max(double ... n) {
        double m = n[0];
        for (double item : n) {
            m = Math.max(m, item);
        }
        return m;
    }
    public static void main(String[] args) {
        double kq = min(2);
        System.out.println("Ket qua la: "+kq);
        kq = max(3,4.8,7);
        System.out.println("Ket qua la: "+kq);
        kq = max(2,3,6,7,8.5,9);
        System.out.println("Ket qua la: "+kq);
        kq = min(5.3,6.5);
        System.out.println("Ket qua la: "+kq);
    }
}