package Bai1;

public class ChuNhat {
    double dai;
    double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public double getChuVi(){
        return (dai+rong)*2;
    }
    public double getDienTich(){
        return dai*rong;
    }
    public void xuat(){
        System.out.println("Chieu dai HCN: "+dai);
        System.out.println("Chieu rong HCN: "+rong);
        System.out.println("Chu vi HCN: "+getChuVi());
        System.out.println("Dien tich HCN: "+getDienTich());
        System.out.print("\n");
    }
}
