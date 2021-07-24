package bai1;

import static ThuVien.NhapDuLieu.nhapString;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachST {
    ArrayList<Double> list = new ArrayList<Double>();
    //Nhap
    public void nhap(){
        System.out.println("Nhap danh sach cac so thuc: ");
        Scanner nhap = new Scanner(System.in);
        while(true){
            System.out.print("Nhap so: ");
            Double x = nhap.nextDouble();
            list.add(x);
            
            String tt = nhapString("Nhap them (Y/N)?: ");
            if(tt.equalsIgnoreCase("N")) break;
        }
    }
    //Xuat
    public void xuat(){
        for (Double item : list) {
            System.out.println(" "+item);
        }
    }
    //Tinh tong
    public void tinhTong(){
        double sum = 0;
        for (Double item : list) {
            sum += item;
        }
        System.out.println("Tong cac so thuc = "+sum);
    }
}
