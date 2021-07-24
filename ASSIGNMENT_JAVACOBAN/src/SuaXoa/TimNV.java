package SuaXoa;

import java.util.ArrayList;
import KieuDL.NhanVien;

public class TimNV {
    public static int timTheoMa(ArrayList<NhanVien> ds,String ma){
        int i;
        for(i=0;i<ds.size();i++)
            if(ds.get(i).getMa().equalsIgnoreCase(ma)) break;
        return i;
    }
}
