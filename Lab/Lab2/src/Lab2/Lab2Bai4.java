package Lab2;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) {
        int choice;
        Scanner nhap = new Scanner(System.in);
        System.out.println("+---------------------------------------+");
        System.out.println("| 1. Giải phương trình bậc nhất\t\t|");
        System.out.println("| 2. Giải phương trình bậc 2\t\t|");
        System.out.println("| 3. Tính tiền điện\t\t\t|");
        System.out.println("| 4. Kết thúc\t\t\t\t|");
        System.out.println("+---------------------------------------+");
        System.out.print("Nhập số để chọn (2-4): ");
        choice = nhap.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Bạn chọn chức năng Giải phương trình bậc nhất!");
                System.out.print("Nhập a: ");
                double a = nhap.nextDouble();
                System.out.print("Nhập b: ");
                double b = nhap.nextDouble();
                Lab2Bai1.giaiPTB1(a,b);
                break;
            case 2:
                System.out.println("Bạn chọn chức năng Giải phương trình bậc 2!");
                System.out.print("Nhập a: ");
                a = nhap.nextDouble();
                System.out.print("Nhập b: ");
                b = nhap.nextDouble();
                System.out.print("Nhập c: ");
                double c = nhap.nextDouble();
                Lab2Bai2.giaiPTB2(a,b,c);
                break;
            case 3:
                System.out.println("Bạn chọn chức năng Tính tiền điện!");
                Lab2Bai3.tinhTienDien();
                break;
            case 4:
                System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                System.exit(0); // thoát chương trình
                break;
        }
    }
}