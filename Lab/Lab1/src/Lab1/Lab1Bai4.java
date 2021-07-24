package Lab1;

import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập c: ");
        int c = scanner.nextInt();
        
        double delta = Math.pow(b,2)-4*a*c; //b*b-4*a*c;
        double candelta= Math.sqrt(delta);
        
        System.out.println("Căn delta = "+candelta);
    }
}