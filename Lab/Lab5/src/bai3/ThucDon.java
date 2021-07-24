package bai3;

import ThuVien.NhapDuLieu;

public class ThucDon {
    DanhSachSP sp = new DanhSachSP();
    public void menu(){        
        System.out.println("<< Menu >>");
        System.out.println("============================");
        System.out.println("| 1. Nhap san pham         |");
        System.out.println("| 2. Xuat san pham         |");
        System.out.println("| 3. Sap xep giam theo gia |");
        System.out.println("| 4. Tim va xoa theo ten   |");
        System.out.println("| 5. Xuat gia trung binh   |");
        System.out.println("============================");
        while(true){
            int chon = NhapDuLieu.nhapInt("Nhap so chon: ");
            switch(chon){
                case 1: sp.nhap(); break;
                case 2: sp.xuat(); break;
                case 3: sp.sapXep(); break;
                case 4: sp.timKiem(); break;    
                case 5: sp.tinhTrungBinh(); break;
            }
            String tiep = NhapDuLieu.nhapString("Neu ket thuc hay go n(N)?: ");
            if(tiep.equalsIgnoreCase("N")) break;
        }
    }
}
