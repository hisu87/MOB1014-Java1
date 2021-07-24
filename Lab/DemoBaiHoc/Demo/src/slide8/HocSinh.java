package slide8;

public class HocSinh {
    String ten;
    double tuoi;
    
    {
        System.out.println("Đây là khối không có static thứ 1");
    }
    
    public HocSinh() {
    }
    
    public HocSinh(String ten){
        this.ten = ten;
    }

    public HocSinh(String ten, double tuoi) {
        this(ten);
        this.tuoi = tuoi;
    }
    {
        System.out.println("Đây là khối không có static thứ 2");
    }
}
