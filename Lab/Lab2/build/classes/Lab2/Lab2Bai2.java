package Lab2;

import java.util.Scanner;

public class Lab2Bai2 {
    public static void giaiPTB2(double a,double b,double c){
        if(a==0){
            System.out.printf("Phuong trinh la: %fx + %f = 0\n",b,c);
        }else if(a!=0){
            double delta = b*b-4*a*c;
            System.out.printf("Delta la: %.2f\n",delta);
            if(delta<0){
                System.out.print("Phương trình vô nghiệm!\n");
            }else if(delta==0){
                System.out.printf("Phương trình có nghiệm kép: x = %.2f\n",-b/(2*a));
            }else if(delta>0){
                double r1 = (-b+Math.sqrt(delta))/(2*a);
		double r2 = (-b-Math.sqrt(delta))/(2*a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt: r1 = %.2f , r2 = %.2f\n",r1,r2);
            }
        }
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = nhap.nextDouble();
        System.out.print("Nhập b: ");
        double b = nhap.nextDouble();
        System.out.print("Nhập c: ");
        double c = nhap.nextDouble();
        
        giaiPTB2(a,b,c);
        System.out.print("Kết thúc!\n");
    }
}