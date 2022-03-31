package Case3;

import java.util.Scanner;

public class case3_02 {
    public static void main(String[]args){
        System.out.println("请输入小明的分数");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=60) {
            System.out.println("打屁屁哦");
        }
        else if(a<=90){
            System.out.println("无奖励哦");
        }
        else if(a<=99){
            System.out.println("奖励1块");
        }
        else{
            System.out.println("奖励1亿");
        }
    }
}
