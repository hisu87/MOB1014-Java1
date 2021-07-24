package slide3;

import java.util.Scanner;

public class VongFor1 {
    public static void main(String[] args) {
        //Nhập vào n, tính tổng từ 1 đến n
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = nhap.nextInt();
        int tong = 0;
        for(int i=1;i<=n;i++){
            tong = tong + i;
            i++;
        }
        System.out.println("Tong = "+tong);
    }
}
