package Bai234;

import static ThuVien.NhapDL.nhapDouble;
import static ThuVien.NhapDL.nhapInt;
import static ThuVien.NhapDL.nhapString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Run {
    static ArrayList<SinhVienIT> sinhvienIT = new ArrayList<SinhVienIT>();
    static ArrayList<SinhVienBiz> sinhvienBiz = new ArrayList<SinhVienBiz>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\n==========MENU==========");
            System.out.println("1.  Nhập sinh viên");
            System.out.println("2.  Xuất sinh viên");
            System.out.println("3.  Xuất sinh viên có học lực Giỏi");
            System.out.println("4.  Sắp xếp sinh viên theo điểm");
            System.out.println("5.  Kết thúc");
            System.out.println("");
            int option = nhapInt("Chọn chức năng: ");
            switch (option) {
                case 1: nhap(); break;
                case 2: xuat(); break;
                case 3: xuatsvgioi(); break;
                case 4: sapxep(); xuat(); break;
                case 5: System.exit(0);
            }
        }
    }
    public static void nhap() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập thông tin sinh viên:");
            String ten = nhapString("Họ tên: ");
            String nganh;
            while (true) {
                System.out.print("Ngành học (IT/Biz)?: ");
                nganh = scan.nextLine();
                if (nganh.equalsIgnoreCase("IT") || nganh.equalsIgnoreCase("Biz")) {
                    break;
                }
            }
            if (nganh.equalsIgnoreCase("IT")) {
                Double java = nhapDouble("Điểm Java: ");
                Double html = nhapDouble("Điểm Html: ");
                Double css = nhapDouble("Điểm Css: ");
                SinhVienIT svIT = new SinhVienIT(java, html, css, ten, nganh);
                sinhvienIT.add(svIT);
            } else {
                Double Marketing = nhapDouble("Điểm Marketing: ");
                Double Sales = nhapDouble("Điểm Sales: ");
                SinhVienBiz svBiz = new SinhVienBiz(Marketing, Sales, ten, nganh);
                sinhvienBiz.add(svBiz);
            }
            String tiep = nhapString("Bạn có muốn tiếp tục không (c/k)?: ");
            if(tiep.equalsIgnoreCase("k")) break;
        }
    }
    public static void xuat() {
        System.out.println("Xuất thông tin sinh viên:");
        for (SinhVienIT svIT : sinhvienIT) {
            svIT.xuat();
        }
        for (SinhVienBiz svBiz : sinhvienBiz) {
            svBiz.xuat();
        }
    }
    public static void xuatsvgioi() {
        System.out.println("\nDanh sách sinh viên học lực Giỏi:");
        for (SinhVienIT svIT : sinhvienIT) {
            if (svIT.getHocluc().equals("Giỏi")) {
                svIT.xuat();
            }
        }
        for (SinhVienBiz svBiz : sinhvienBiz) {
            if (svBiz.getHocluc().equals("Giỏi")) {
                svBiz.xuat();
            }
        }
    }
    public static void sapxep() {
        System.out.println("Sắp xếp sinh viên theo điểm:");
        Comparator<SinhVienIT> SapxepIT = new Comparator<SinhVienIT>() {
            @Override
            public int compare(SinhVienIT o1, SinhVienIT o2) {
                return o2.getDiem().compareTo(o1.getDiem());
            }
        };
        Comparator<SinhVienBiz> SapxepBiz = new Comparator<SinhVienBiz>() {
            @Override
            public int compare(SinhVienBiz o1, SinhVienBiz o2) {
                return o2.getDiem().compareTo(o1.getDiem());
            }
        };
        Collections.sort(sinhvienIT, SapxepIT);
        Collections.sort(sinhvienBiz, SapxepBiz);
    }
}
