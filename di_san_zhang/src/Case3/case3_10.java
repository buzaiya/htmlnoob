package Case3;

import java.util.Scanner;

public class case3_10 {
    public static void main(String[]args) {
        System.out.println("请输入几行");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int i, j, k;
        for (i=1;i<=a;i++){
            for (j=1;j<=a-i;j++){
                System.out.print(" ");
                }
                for (k=1;k<=2*i-1;k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }