
package chuoi;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Username: ");
        String user = nhap.nextLine();
        System.out.print("Password: ");
        String pass = nhap.nextLine();
        if(user.equalsIgnoreCase("hello") && pass.length()>=6){
            System.out.println("Mời vào chill bạn êii!");
        }else{
            System.out.println("Né ra chỗ khác chơi đêii!");
        }
    }
}
