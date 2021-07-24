package Bai1;

import ThuVien.NhapDuLieu;
import static ThuVien.NhapDuLieu.nhapInt;
import java.util.Scanner;

public class Menu {
    public void menu(){        
        System.out.println("<< Menu >>");
        System.out.println("==============");
        System.out.println("| 1. Câu 1.1  ");
        System.out.println("| 2. Câu 1.2  ");
        System.out.println("| 3. Thoat    ");
        System.out.println("==============");
        while(true){
            int chon = NhapDuLieu.nhapInt("Nhap so chon: ");
            switch(chon){
                case 1: {
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
                }; break;
                case 2: {
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
                }; break;
                case 3: System.exit(0);
            }
        }
    }
}
