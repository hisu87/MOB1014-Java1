package Lab1;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        double thetich = canh*canh*canh; //Math.pow(canh,3)
        System.out.println("Thể tích khối lập phương = "+thetich);
    }
}