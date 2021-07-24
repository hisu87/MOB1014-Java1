package Bai234;

public class SinhVienIT extends SinhVienPoly {
    Double diemJava, diemHtml, diemCss;
    
    public SinhVienIT() {
    }
    public SinhVienIT(Double diemJava, Double diemHtml, Double diemCss, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }
    @Override
    Double getDiem() {
        return (this.diemJava * 2 + this.diemHtml + this.diemCss) / 4;
    }
}
