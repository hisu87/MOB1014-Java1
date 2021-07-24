package ctyrongviet;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNV {
    private ArrayList<NhanVien> list = new ArrayList<>();
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        list.clear();
        do{
            System.out.print("Nhập loại nhân viên (Enter để thoát, 1. Hành Chính, 2. Tiếp Thị, 3. Trưởng Phòng): ");
            String loai = nhap.nextLine();
            if(loai == null || loai.equals(""))
                break;
            int iloai = Integer.parseInt(loai);
            switch(iloai){
                case 1:
                    HanhChinh hc = new HanhChinh();
                    hc.nhap(nhap);
                    list.add(hc);
                    break;
                case 2:
                    TiepThi tt = new TiepThi();
                    tt.nhap(nhap);
                    list.add(tt);
                    break;
                case 3:
                    TruongPhong tp = new TruongPhong();
                    tp.nhap(nhap);
                    list.add(tp);
                    break;
            }
        } while(true);
    }
    public void xuat(){
        System.out.println("Danh sach nhan vien:");
        for (NhanVien nv : list) {
            if(nv instanceof HanhChinh){
                ((HanhChinh)nv).xuat();
            }else if(nv instanceof TiepThi){
                ((TiepThi)nv).xuat();
            } else if(nv instanceof TruongPhong){
                ((TruongPhong)nv).xuat();
            }
            System.out.println("\n-----------------");
        }
    }
}
