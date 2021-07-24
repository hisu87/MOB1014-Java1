package Bai1;

import static ThuVien.NhapDuLieu.nhapInt;
import java.util.*;

public class TrungBinhCong {
    public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] num = new double[n];
        for(int i=0; i<num.length; i++){
            System.out.print("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            num[i] = scanner.nextDouble();
        }
        scanner.close();
        double sum = 0;
        for(int i=0; i<num.length; i++){
            sum = sum + num[i];
        }
        double avg = sum/num.length;
        System.out.println("Tổng trung bình cộng là: %.3f"+avg);
    
    }
}
