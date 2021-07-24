package MangDong;


import static ThuVien.NhapDuLieu.nhapInt;
import static ThuVien.NhapDuLieu.nhapString;
import ThuVien.SinhVien;
import java.util.ArrayList;

public class QLSV {
    public static void main(String[] args) {
        ArrayList<SinhVien> dssv = new ArrayList<>();
        // Nhap so sinh vien
        int n = nhapInt("So sinh vien: ");
        // Nhap mang sinh vien
        for (int i=0;i<n;i++){
            SinhVien sv = new SinhVien();
            sv.nhap(nhapString("Nhap Ten: "), nhapInt("Nhap Tuoi: "));
            dssv.add(sv);
        }
        System.out.println("-------------------------");
        //Xuat danh sach sinh vien dung for(;;)
        for (int i=0;i<dssv.size();i++){
            dssv.get(i).xuat();
        }
        System.out.println("-------------------------");
        // Xuat dssv dung for each
        for (SinhVien sv : dssv) {
            sv.xuat();
        }
        System.out.println("-------------------------");
        // Them sinh vao 1 vi tri nao do
        SinhVien svt = new SinhVien();
        System.out.println("-Them sinh vien moi-");
        svt.nhap(nhapString("Ten: "), nhapInt("Tuoi: "));
        dssv.add(2,svt);
        System.out.println("-------------------------");
        for (SinhVien sv : dssv) {
            sv.xuat();
        }
        
    }
}
