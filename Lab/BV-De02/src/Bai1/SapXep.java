package Bai1;

import static ThuVien.NhapDuLieu.nhapInt;
import java.util.Scanner;

public class SapXep {
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);
        int n = nhapInt("Nhập vào số lượng phần tử của mảng:");
        int gttd[] = new int[n];
        System.out.println("Nhập vào các phần tử trong mảng:");
        for (int i=0;i<n;i++)
            gttd[i] = input.nextInt();
        for (int i=0;i<(n-1);i++) {
            for (int j=0;j<n-i-1;j++) {
                if (gttd[j] < gttd[j+1]){
                    temp = gttd[j];
                    gttd[j] = gttd[j+1];
                    gttd[j+1] = temp;
                }
            }
        }
        System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(gttd[i] + "\t");
        }
    }
}
