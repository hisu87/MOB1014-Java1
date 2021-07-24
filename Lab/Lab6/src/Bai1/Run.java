package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoten = nhap.nextLine();
        String[] ars = hoten.split(" ");
        String ho = ars[0];
        String ten = ars[ars.length-1];
        ho = ho.toUpperCase();
        ten = ten.toUpperCase();
        //Xuất
        System.out.println("============================");
        System.out.print(ten+" "+ho+" ");
        for (int i=1;i<ars.length-1;i++){
            System.out.print(ars[i]+" ");
        }
        System.out.println("\n");
    }
}