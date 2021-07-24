package Lab2;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void tinhTienDien(){
        double tienDien;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số điện: ");
        double soDien = nhap.nextDouble();
        if(soDien<=50){
            tienDien = soDien*1000;
        }else{
            tienDien = 50*1000+(soDien-50)*1200;
        }
        System.out.printf("Số tiền phải trả: %f\n",tienDien);
    }
    public static void main(String[] args) {
        tinhTienDien();
    }
}