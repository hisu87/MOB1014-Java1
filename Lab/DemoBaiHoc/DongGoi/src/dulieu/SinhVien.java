package dulieu;

public class SinhVien {
        private String ten;
        private double diem;
        public void setTen(String ten) {
            this.ten = ten;
        }
        public void setDiem(double diem) {
            if(diem>=0 && diem<=10){
                this.diem = diem;
            }else{
                System.out.println("Diem khong hop le");
            }
        }
        public String getTen() {
            return ten;
        }
        public double getDiem() {
            return diem;
        }
        public void xuat(){
            System.out.println("Ten: "+ten);
            System.out.println("Diem: "+diem);
        }
}
