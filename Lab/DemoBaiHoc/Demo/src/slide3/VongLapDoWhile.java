package slide3;

import java.util.Scanner;

public class VongLapDoWhile {
    public static void main(String[] args) {
        //Nhập số nguyên từ bàn phím
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = nhap.nextInt();
        int i = 2;
        Boolean ktra = true;
        do{
            if(n%i==0 && i<n){
                ktra = false;
                break;
            }
            i++;
        } while(i<n);
        if(ktra==true)
            System.out.println("Là số nguyên tố");
        else
            System.out.println("Không phải là số nguyên tố");
    }
}
