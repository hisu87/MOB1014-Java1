package slide2;

import java.util.Scanner;

public class LenhSwitchCase {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        // không để bị trôi lệnh ta nhập chữ số sau khi chuyển thành chữ số
        System.out.print("Nhập số thứ nhất: ");
        int x = Integer.parseInt(nhap.nextLine());
        System.out.print("Nhập số thứ hai: ");
        int y = Integer.parseInt(nhap.nextLine());
        System.out.print("Nhập phép tính: ");
        String c = nhap.nextLine();
        int q = 0;
        switch(c){
            case "+": System.out.printf("%d + %d = %d\n",x,y,x+y); break;
            case "-": System.out.printf("%d - %d = %d\n",x,y,x-y); break;
            case "*": System.out.printf("%d * %d = %d\n",x,y,x*y); break;
            case "/": System.out.printf("%d / %d = %d\n",x,y,x/y); break;
            case "%": System.out.println(x +"%"+ y + "="+ (x%y));
        }
    }
}
