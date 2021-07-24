package ctyrongviet;

import static ThuVien.NhapDuLieu.nhapInt;
import static ThuVien.NhapDuLieu.nhapString;

public class Menu {
    public static void thucDon(){
        while (true) {            
            System.out.println("<< Công ty Rồng Việt >>");
            System.out.println("=================================================");
            System.out.println("|   1. Nhập danh sách nhân viên.\t\t|");
            System.out.println("|   2. Xuất danh sách nhân viên.\t\t|");
            System.out.println("|   3. Tìm và hiển thị nhân viên theo mã.\t|");
            System.out.println("|   4. Xóa nhân viên theo mã.\t\t\t|");
            System.out.println("|   5. Cập nhật thông tin nhân viên theo mã.\t|");
            System.out.println("|   6. Tìm các nhân viên theo khoảng lương.\t|");
            System.out.println("|   7. Sắp xếp nhân viên theo họ và tên.\t|");
            System.out.println("|   8. Sắp xếp nhân viên theo thu nhập.\t\t|");
            System.out.println("|   9. Xuất 5 nhân viên có thu nhập cao nhất.\t|");
            System.out.println("=================================================");
            int chon = nhapInt("Nhập số để chọn chức năng: ");
            switch(chon){
                case 1:
                    System.out.println("Bạn đã chọn Nhập danh sách nhân viên.");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Xuất danh sách nhân viên.");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Tìm và hiển thị nhân viên theo mã.");
                    break;
                case 4:
                    System.out.println("Bạn đã chọn Xóa nhân viên theo mã.");
                    break;
                case 5:
                    System.out.println("Bạn đã chọn Cập nhật thông tin nhân viên theo mã.");
                    break;
                case 6:
                    System.out.println("Bạn đã chọn Tìm các nhân viên theo khoảng lương.");
                    break;
                case 7:
                    System.out.println("Bạn đã chọn Sắp xếp nhân viên theo họ và tên.");
                    break;
                case 8:
                    System.out.println("Bạn đã chọn Sắp xếp nhân viên theo thu nhập.");
                    break;
                case 9:
                    System.out.println("Bạn đã chọn Xuất 5 nhân viên có thu nhập cao nhất.");
                    break;
            }
            String thoat = nhapString("Nếu muốn thoát chương trình hãy gõ n?: ");
            if(thoat.equalsIgnoreCase("N")) break;
        }
    }
}
