package slide3;

import java.util.Scanner;

public class VongFor2 {
    public static void main(String[] args) {
        //In bảng cửu chương
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
        }
    }
}
