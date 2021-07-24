package bai2;

import ThuVien.NhapDuLieu;
import static bai2.NhapXuatDS.nhap;
import static bai2.NhapXuatDS.xuat;
import java.util.ArrayList;
import java.util.Collections;

public class ThucDon {
    static ArrayList<String> dsTen = new ArrayList<String>();
    public static void menu(){        
        System.out.println("<< Menu >>");
        System.out.println("=================================");
        System.out.println("| 1. Nhap sinh vien             |");
        System.out.println("| 2. Xuat sinh vien             |");
        System.out.println("| 3. Sap xep sinh vien          |");
        System.out.println("| 4. Trao ngau nhien sinh vien  |");
        System.out.println("| 5. Xoá sinh vien              |");
        System.out.println("=================================");
        while(true){
            int chon = NhapDuLieu.nhapInt("Nhập số chọn: ");
            switch(chon){
                case 1: nhap(dsTen); break;
                case 2: xuat(dsTen); break;
                case 3: Collections.sort(dsTen); break;
                case 4: Collections.shuffle(dsTen); break;    
                case 5: dsTen.remove(1); break;
            }
            String tiep = NhapDuLieu.nhapString("Nếu kết thúc hãy gõ n(N)?: ");
            if(tiep.equalsIgnoreCase("N")) break;
        }
    }
}
