package slide8;

public class LopChay {
    public static void main(String[] args) {
        System.out.println("Bắt đầu hàm main");
        HocSinh hs = new HocSinh("A",2);
        TieuHoc th = new TieuHoc();
        sum(1,2,3);
        sum(1,2,3,4);
        int x[] = {3,4,5,6};
        sum(1,2,x);
        HocSinh mn = new TieuHoc();
        
    }
    static void sum(int y,int z,int...x){
        int tong = y + z;
        for (int a : x) {
            tong += a;
        }
        System.out.println("Tong: "+tong);
    }
}
