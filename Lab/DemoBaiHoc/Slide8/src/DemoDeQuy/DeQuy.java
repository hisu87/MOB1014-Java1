package DemoDeQuy;

import java.util.Scanner;

public class DeQuy {
    static void xuat(int n){
        if(n>0){
            System.out.println("Ket thuc Slide 8");
            xuat(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so lan: ");
        int n = input.nextInt();
        xuat(n);
    }
}
