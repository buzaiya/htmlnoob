package Case3;

import java.util.Scanner;

public class case3_09 {
    public static void main(String[]args){
        System.out.println("请输入一个整数");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1,c=1,d=0;
        for(int f=3;f<=a;f++){
            d=c;
            c=b+c;
            b=d;
        }
        System.out.println(c);
    }
}
