package Bai1;

public class Sum {
    public static double sum(double ... n) {
        double s=0;
        for (double tong : n) {
            s += tong;
        }
        return s;
    }
    public static void main(String[] args) {
        double kq = sum(2);
        System.out.println("Ket qua la: "+kq);
        kq = sum(3,4.8,7);
        System.out.println("Ket qua la: "+kq);
        kq = sum(2,3,6,7,8.5,9);
        System.out.println("Ket qua la: "+kq);
        kq = sum(5.3,6.5);
        System.out.println("Ket qua la: "+kq);
    }
}
