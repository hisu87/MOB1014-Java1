package MangDong;

import java.util.ArrayList;

public class TapLop {
    public static void main(String[] args) {
        ArrayList tap1 = new ArrayList<>();
        tap1.add(3);
        tap1.add(4);
        System.out.println(tap1.toString());
        ArrayList tap2 = new ArrayList<>();
        tap2.add(2);
        tap2.add(4);
        tap2.add(5);
        System.out.println(tap2.toString());
        // Phép hợp
        // tap1.addAll(tap2);
        // Phép giao
        // tap1.retainAll(tap2);
        // Phép hiệu
        // tap1.removeAll(tap2);
        // tap2.removeAll(tap1);
        System.out.println(tap1.toString());
    }
}
