package Mang;

import java.util.Scanner;

public class XuatNhapMang {
    public static void main(String[] args) {
        Scanner nhap= new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng: ");
        int n = nhap.nextInt();      
        int[] M = new int[n];
        //nhập mảng
        for(int i=0;i<M.length;i++){
        System.out.printf("M[%d] = ",i);
        M[i] = nhap.nextInt();
    }
    //Xuất mảng
    for(int i=0;i<M.length;i++){
        System.out.printf("M[%d] = %d\n", i, M[i]);
    }
    }
}
