package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args){
        int sum=0,temp;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng: ");
        int n = nhap.nextInt();
        int M[] = new int[n];
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
        //Xuất mảng đã sắp xếp
        Arrays.sort(M);
        System.out.println("Xuất mảng đã sắp xếp: ");
        for(int i=0;i<M.length;i++){
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
        //Tìm phần tử nhỏ nhất
        int min = M[0];  
        for (int i=0;i<M.length;i++){  
            min = Math.min(min,M[i]);
        }
        System.out.printf("Phần tử nhỏ nhất trong mảng là: %d",min);
        //Tính tổng các phần tử có trong mảng chia hết cho 3
        for(int i=0;i<M.length;i++){
            if(M[i]%3==0){
                sum += M[i];
            }
            i++;
            sum /= i;
        }
        System.out.println("\nTổng các pt chia hết cho 3 trong mảng là: "+sum);
    }
}
