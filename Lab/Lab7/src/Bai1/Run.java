package Bai1;

import static ThuVien.NhapDL.nhapDouble;
import static ThuVien.NhapDL.nhapInt;

public class Run {
    public static void main(String[] args) {
        int n = nhapInt("So hinh chu nhat: ");
        ChuNhat[] hcn = new ChuNhat[n];
        for(int i=0;i<n;i++){
            double dai = nhapDouble("Chieu dai HCN: ");
            double rong = nhapDouble("Chieu rong HCN: ");
            ChuNhat cn = new ChuNhat(dai,rong);
            hcn[i] = cn;
        }
        double canh = nhapDouble("Do dai canh vuong: ");
        ChuNhat vu = new Vuong(canh);
        System.out.println("====================");
        for(int i=0;i<n;i++){
            System.out.printf("Thong tin HCN thu %d:\n",i);
            hcn[i].xuat();
        }
        vu.xuat();
    }
}
