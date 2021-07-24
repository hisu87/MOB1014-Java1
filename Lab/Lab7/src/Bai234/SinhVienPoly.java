package Bai234;

abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly() {
    }
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    abstract Double getDiem();
    public String getHocluc(){
        if(this.getDiem()>=9){
            return "Xuất sắc";
        }else if(this.getDiem()>=7.5){
            return "Giỏi";
        }else if(this.getDiem()>=6.5){
            return "Khá";
        }else if(this.getDiem()>=5){
            return "Trung bình";
        }else{
            return "Yếu";
        }
    } 
    public void xuat(){
        System.out.println("Thông tin sinh viên:");
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Ngành: " + this.nganh);
        System.out.println("Điểm: " + this.getDiem());
        System.out.println("Học lực: " + this.getHocluc());
        System.out.println("");
    }
}
