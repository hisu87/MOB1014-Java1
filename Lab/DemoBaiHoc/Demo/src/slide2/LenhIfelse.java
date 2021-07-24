package slide2;

import java.util.Scanner;

public class LenhIfelse {
    public static void main(String[] args) {
        // Nhập 3 số a,b,c từ bàn phím
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = nhap.nextInt();
        System.out.print("Nhập b = ");
        int b = nhap.nextInt();
        System.out.print("Nhập c = ");
        int c = nhap.nextInt();
        // Cách 1 tìm max của 3 số
        /*
        int max = a;
        if(max<b)
            max = b;
        if(max<c)
            max = c;
        System.out.printf("Kết quả là: %d\n",max);
        */
        // Cách 2 tìm max của 3 số
        int max1 = a;
        if(max1<b){
            max1 = b;
            if(max1<c)
                max1 = c;
        }
        else if(max1<c)
            max1 = c;
        System.out.printf("Kết quả là: %d\n",max1);
    }
}
