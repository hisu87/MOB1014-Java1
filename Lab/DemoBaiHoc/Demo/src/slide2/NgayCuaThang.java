package slide2;

import java.util.Scanner;

public class NgayCuaThang {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        //Nhập năm
        System.err.print("Nhập năm: ");
        int nam = nhap.nextInt();
        //Nhập tháng
        System.err.print("Nhập tháng: ");
        int thang = nhap.nextInt();
        switch(thang){
            case 2:
                if((nam%400==0) || (nam%4==0 && nam%100!=0))
                    System.out.println("Có 29 ngày");
                else
                    System.out.println("Có 28 ngày"); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày"); break;
            default:
                System.out.println("Có 31 ngày");
        }
    }
}