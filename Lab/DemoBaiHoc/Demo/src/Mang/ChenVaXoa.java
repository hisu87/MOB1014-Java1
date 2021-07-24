package Mang;

import java.util.Scanner;

public class ChenVaXoa {
    public static void main(String[] args) {
        int[] M = new int[100];
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số phần tử thực tế: ");
        int n = nhap.nextInt();      
        //Nhập mảng
        for(int i=0;i<n;i++){
            System.out.printf("M[%d] = ",i);
            M[i] = nhap.nextInt();
        }
        //Xuất mảng
        System.out.println("Xuất mảng trước khi chèn: ");
        for(int i=0;i<n;i++){
            System.out.printf("M[%d] = %d\n", i, M[i]);
        }
        //Chèn phần tử
        System.out.print("Nhập vị trí chèn: ");
        int vtc = nhap.nextInt();
        System.out.print("Giá trị chèn: ");
        int gt = nhap.nextInt();
        for(int i=n-1;i>=vtc;i--){
            //di chuyển các phần tử từ cuối đến vtc sang phải 1 vị trí
            M[i+1] = M[i];
        }
        M[vtc] = gt; //bắt đầu chèn
        n++; //cập nhật số phần tử thực tế
        //Xuất mảng chèn
        System.out.println("Xuất mảng sau khi chèn: ");
        for(int i=0;i<n;i++){
            System.out.printf("M[%d] = %d\n", i, M[i]);
        }
        //Xoá phần tử
        System.out.print("Nhập vị trí xoá: ");
        int vtx = nhap.nextInt();
        // di chuyển sáng trái các phần tử bắt đầu ủa vtx +1 cho pt cuối sang trái
        for(int i=vtx;i<n;i++){
            //di chuyển các phần tử từ cuối đến vtc sang phải 1 vị trí
            M[i] = M[i+1];
        }
        n--;
        //Xuất mảng xoá
        System.out.println("Xuất mảng sau khi xoá: ");
        for(int i=0;i<n;i++){
            System.out.printf("M[%d] = %d\n", i, M[i]);
        }
    }
}
