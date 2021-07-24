package slide3;

import static ThuVien.NhapDuLieu.nhapInt;
import static ThuVien.NhapDuLieu.nhapString;

public class VongWhile1 {
    public static void main(String[] args) {
        while (true) {            
            int n = nhapInt("Nhập n: ");
            int i=1,tong=0;
            while (i<=n) {
                if(i%2==0) tong = tong + 1;
                    i++;
            }
            System.out.println("Tổng = "+tong);
            String thoat = nhapString("Bạn có muốn thoát không? (gõ n): ");
            if(thoat.equalsIgnoreCase("N"))
                break;
        }
    }
}
