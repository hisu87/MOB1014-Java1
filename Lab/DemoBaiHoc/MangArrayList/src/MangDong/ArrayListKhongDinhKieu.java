package MangDong;

import java.util.ArrayList;

public class ArrayListKhongDinhKieu {
    public static void main(String[] args) {
        ArrayList mang = new ArrayList();
        mang.add("Chuoi");
        mang.add(1);
        mang.add(3.14);
        mang.add(true);
        System.out.println("So phan tu: "+mang.size());
        for(int i=0;i<mang.size();i++){
            System.out.println(mang.get(i));
        }
    }
}
