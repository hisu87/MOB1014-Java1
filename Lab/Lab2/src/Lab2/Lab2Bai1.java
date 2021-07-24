package Lab2;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void giaiPTB1(double a,double b){
        if(a==0){
            if(b==0){
                System.out.print("Phương trình có vô số nghiệm!\n");
            }else{
                System.out.print("Phương trình vô nghiệm!\n");
            }
        }else{
            double x = -b/a;
            System.out.printf("Phương trình có nghiệm x = %f\n",x);
        }
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = nhap.nextDouble();
        System.out.print("Nhập b: ");
        double b = nhap.nextDouble();
        
        giaiPTB1(a,b);
        System.out.print("Kết thúc!\n");
    } 
}