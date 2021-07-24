package bai3;

import ThuVien.NhapDuLieu;
import java.util.Scanner;

public class SinhVien {
    private String hoten, email, sdt, cmnd;

    public SinhVien() {
    }
    public SinhVien(String hoten, String email, String sdt, String cmnd) {
        this.hoten = hoten;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }
    public void nhap(Scanner nhap){
        do {            
            hoten = NhapDuLieu.nhapString("Ho ten: ");
            if(hoten == null || hoten.equals("")){
                System.out.println("Ho ten khong hop le.");
            }else{
                break;
            }
        } while (true);
        DataValidator dv = new DataValidator();
        do {            
            email = NhapDuLieu.nhapString("Email: ");
            if(dv.isEmail(email)){
                break;
            }
            System.out.println("Email khong hop le.");
        } while (true);
        do {            
            sdt = NhapDuLieu.nhapString("SDT: ");
            if(dv.isSDT(sdt)){
                break;
            }
            System.out.println("SDT khong hop le.");
        } while (true);
        do {            
            cmnd = NhapDuLieu.nhapString("CMND: ");
            if(dv.isCMND(cmnd)){
                break;
            }
            System.out.println("CMND khong hop le.");
        } while (true);
    }
    public void xuat(){
        System.out.printf("Ho ten: %s - Email: %s - SDT: %s - CMND: %s\n",hoten,email,sdt,cmnd);
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String getCmnd() {
        return cmnd;
    }
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
}
