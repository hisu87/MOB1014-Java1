package Lab1;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int dai = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int rong = scanner.nextInt();
        
        int dientich = dai*rong;
        int chuvi = (dai+rong)*2;
        int canhnho = Math.min(dai, rong);
        
        System.out.print("Diện tích = "+dientich);
        System.out.print("\nChu vi = "+chuvi);
        System.out.println("\nSố nhỏ nhất trong 2 số là " + canhnho);
        System.out.print("\n");
    }
}