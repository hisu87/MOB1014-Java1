package Lab3;

import java.util.Scanner;

class SinhVien{
    private String ten;
    private float diem;
    public void setTen (String ten){
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }
    public void setDiem(float diem){
        this.diem= diem;
    }
    public float getDiem (){
        return diem;
    }
}

public class Lab3Bai4 {
    public static void main(String[] args) {
        String ten;
        float diem;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = Integer.parseInt(nhap.nextLine());
        SinhVien a[] = new SinhVien[n];
        for(int i=0;i<n;i++){
            a[i] = new SinhVien();
            System.out.print("Tên sinh viên: ");
            ten = nhap.nextLine();
            a[i].setTen(ten);
            System.out.print("Điểm: ");
            diem = nhap.nextFloat();
            a[i].setDiem(diem);
            nhap.nextLine();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].getDiem() > a[j].getDiem()){
                    SinhVien temp = new SinhVien();
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Thông tin sinh viên sau khi sắp xếp là: ");
        for(int i=0;i<n;i++){
            System.out.println("Tên sinh viên: "+a[i].getTen());
            System.out.println("Điểm sinh viên: "+a[i].getDiem());
            if(a[i].getDiem()>=9){
                System.out.println("Học lực: Xuất sắc");
            }else if(a[i].getDiem()<9 && a[i].getDiem()>=7.5){
                System.out.println("Học lực: Giỏi");
            }else if(a[i].getDiem()<7.5 && a[i].getDiem()>=6.5){
                System.out.println("Học lực: Khá");
            }else if(a[i].getDiem()<6.5 && a[i].getDiem()>=5){
                System.out.println("Học lực: Trung bình");
            }else if(a[i].getDiem()<5){
                System.out.println("Học lực: Yếu!!!");
            }
        }
    }
}