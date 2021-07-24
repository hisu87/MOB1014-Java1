package Bai3;

import java.util.Scanner;

class SV{
    private String msSV;
    private String ten;
    private float diemJava1;
    private float diemWeb1;

    SV() {}

    public String getMsSV() {
        return msSV;
    }
    public void setMsSV(String msSV) {
        this.msSV = msSV;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public float getDiemJava1() {
        return diemJava1;
    }
    public void setDiemJava1(float diemJava1) {
        this.diemJava1 = diemJava1;
    }
    public float getDiemWeb1() {
        return diemWeb1;
    }
    public void setDiemWeb1(float diemWeb1) {
        this.diemWeb1 = diemWeb1;
    }
    public SV(String msSV, String ten, float diemJava1, float diemWeb1) {
        this.msSV = msSV;
        this.ten = ten;
        this.diemJava1 = diemJava1;
        this.diemWeb1 = diemWeb1;
    }
}
public class SinhVien {
    public static void main(String[] args) {
        String ten;
        float diemJava1, diemWeb1;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = Integer.parseInt(nhap.nextLine());
        SV a[] = new SV[n];
        for(int i=0;i<n;i++){
            a[i] = new SV();
            System.out.print("Tên sinh viên: ");
            ten = nhap.nextLine();
            a[i].setTen(ten);
            System.out.print("Điểm Java1: ");
            diemJava1 = nhap.nextFloat();
            a[i].setDiemJava1(diemJava1);
            System.out.print("Điểm Web1: ");
            diemWeb1 = nhap.nextFloat();
            a[i].setDiemWeb1(diemWeb1);
            nhap.nextLine();
        }
        System.out.println("Thông tin sinh viên sau khi sắp xếp là: ");
        for(int i=0;i<n;i++){
            System.out.println("Tên sinh viên: "+a[i].getTen());
            System.out.println("Điểm sinh viên: "+(a[i].getDiemJava1()+a[i].getDiemWeb1())/2);
            if((a[i].getDiemJava1()+a[i].getDiemWeb1())/2>=9){
                System.out.println("Học lực: Xuất sắc");
            }else if((a[i].getDiemJava1()+a[i].getDiemWeb1())/2>=7.5){
                System.out.println("Học lực: Giỏi");
            }else if((a[i].getDiemJava1()+a[i].getDiemWeb1())/2>=6.5){
                System.out.println("Học lực: Khá");
            }else if((a[i].getDiemJava1()+a[i].getDiemWeb1())/2>=5){
                System.out.println("Học lực: Trung bình");
            }else if((a[i].getDiemJava1()+a[i].getDiemWeb1())/2<5){
                System.out.println("Học lực: Yếu!!!");
            }
        }
    }
}