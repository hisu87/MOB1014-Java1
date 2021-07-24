package Bai1;

public class Vuong extends ChuNhat{
    
    public Vuong(double canh) {
        super(canh,canh);
    }
    @Override
    public void xuat(){
        System.out.println("Canh hinh vuong: "+super.rong);
        System.out.println("Dien tich hinh vuong: "+super.getDienTich());
        System.out.println("Chu vi hinh vuong: "+super.getChuVi());
    }
}
