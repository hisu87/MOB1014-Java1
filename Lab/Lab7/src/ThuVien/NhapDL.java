package ThuVien;

import java.util.Scanner;

public class NhapDL {
    static Scanner nhap = new Scanner(System.in);
        public static int nhapInt(String LoiNhac){
            System.out.print(LoiNhac);
            return Integer.parseInt(nhap.nextLine());
        }
        public static float nhapFloat(String LoiNhac){
            System.out.print(LoiNhac);
            return Float.parseFloat(nhap.nextLine());
        }
        public static double nhapDouble(String LoiNhac){
            System.out.print(LoiNhac);
            return Double.parseDouble(nhap.nextLine());
        }
        public static String nhapString(String LoiNhac){
            System.out.print(LoiNhac);
            return nhap.nextLine();
        }
}