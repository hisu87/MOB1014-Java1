package Mang;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class SapXepMang {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng: ");
        int n = nhap.nextInt();
        int[] M = new int[n];
        //Nhập mảng
        for(int i=0;i<M.length;i++){
            System.out.printf("M[%d] = ",i);
            M[i] = nhap.nextInt();
        }
        //Xuất mảng khi chưa sắp xếp
        System.out.println("Xuất mảng chưa sắp xếp: ");
        for(int i=0;i<M.length;i++){
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
        sort(M);
        //Xuất mảng đã sắp xếp
        System.out.println("Xuất mảng đã sắp xếp: ");
        for(int i=0;i<M.length;i++){
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
    }
}
