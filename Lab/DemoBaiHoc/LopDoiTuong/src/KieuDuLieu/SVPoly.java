package KieuDuLieu;

public class SVPoly {
    public String hoTen;
    public double diem;

    public SVPoly(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public SVPoly(String hoTen) {
        this.hoTen = hoTen;
    }

    public SVPoly(double diem) {
        this.diem = diem;
    }
    
    public void xuat(){
        System.out.println("Tên sinh viên: "+hoTen);
        System.out.println("Điểm sinh viên: "+diem);
    }
}
