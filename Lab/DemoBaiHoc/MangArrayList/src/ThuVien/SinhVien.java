package ThuVien;

public class SinhVien {
    public String ten;
    public int tuoi;
    public void nhap(String ten,int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public void xuat(){
        System.out.println("Ten: "+ten);
        System.out.println("Tuoi: "+tuoi);
    }
}
