package Nhap;

import java.util.Scanner;

public class BanPhim {
    static Scanner nhap = new Scanner(System.in);
    public static int nhapINT(String thongBao){
        System.out.print(thongBao);
        return Integer.parseInt(nhap.nextLine());
    }
    public static double nhapDOUBLE(String thongBao){
        System.out.print(thongBao);
        return Double.parseDouble(nhap.nextLine());
    }
    public static float nhapFLOAT( String thongBao){
        System.out.print(thongBao);
        return Float.parseFloat(nhap.nextLine());
    }
    public static String nhapSTRING(String thongBao){
        System.out.print(thongBao);
        return nhap.nextLine();
    }
}
