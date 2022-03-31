package Case3;

import java.util.Random;
import java.util.Scanner;

public class case3_13 {
    public static void main(String[]agrs){
        Random r=new Random();
        int num=r.nextInt(100)+1;
        //System.out.println(num);
        System.out.println("请输入一个1-100的数字");
        while (true){
            Scanner s=new Scanner(System.in);
            int number1=s.nextInt();
           if (number1>num){
               System.out.println("猜大了");
           }
           if(number1<num) {
               System.out.println("猜小了");
           }
           if (number1==num){
               System.out.println("猜对了");
               break;
           }
        }
    }
}
