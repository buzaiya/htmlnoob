package Case3;

import java.util.Scanner;

public class case3_01 {
    public static void main(String[] agrs){
        System.out.println("请输入一个整数");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("这个数是偶数");
        }
        else{
            System.out.println("这个数是奇数");
        }
        System.out.println("结束");
    }
}
