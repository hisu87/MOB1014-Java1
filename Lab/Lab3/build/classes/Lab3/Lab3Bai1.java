package Lab3;

import java.util.Scanner;

public class Lab3Bai1 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = nhap.nextInt();
        boolean ok = true;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                ok = false;
                break;
            }
            i++;
        }
        if(ok==true)
            System.out.println("Là số nguyên tố");
        else
            System.out.println("Không phải là số nguyên tố");
    }
}
