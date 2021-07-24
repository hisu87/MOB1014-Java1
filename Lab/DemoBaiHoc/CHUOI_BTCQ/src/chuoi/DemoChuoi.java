package chuoi;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoChuoi {
    public static void main(String[] args) {
        ArrayList<String> dsTen = new ArrayList<String>();
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        //Nhập
        int n = Integer.parseInt(nhap.nextLine());
        for (int i=0;i<n;i++){
            System.out.print("Nhap: ");
            String ten = nhap.nextLine();
            dsTen.add(ten);
        }
        //Xuất
        System.out.println("============================");
        for (String x : dsTen) {
            System.out.println(x);
        }
        //Đổi chữ thường thành hoa
        System.out.println("============================");
        for (String x : dsTen) {
            x = x.toUpperCase();
            System.out.println(x);
        }
        //Chiều dài chuỗi
        System.out.println("============================");
        for (String x : dsTen) {
            System.out.println(x+" có "+ x.length() +" ký tự");
        }
        //Xuất ra những người có họ Nguyễn
        System.out.println("============================");
        for (String x : dsTen) {
            x = x.toUpperCase();
            if(x.startsWith("NGUYEN")){
                System.out.println(x);
            }
        }
        //Xuất ra những người Nữ
        System.out.println("============================");
        for (String x : dsTen) {
            x = x.toUpperCase();
            if(x.contains(" THI "));
            System.out.println(x);
        }
        //Chỉ xuất tên
        System.out.println("============================");
        for (String x : dsTen) {
            int vtt = x.lastIndexOf(" "); //Vi tri ky tu trang cuoi cung
            int vttt = vtt + 1; //Vi tri ky tu dau cua ten
            System.out.println(x.substring(vttt));
        }
    }
}
