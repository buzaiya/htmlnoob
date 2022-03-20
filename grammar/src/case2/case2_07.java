package case2;
import java.util.Scanner;
public class case2_07 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个和尚身高：");
        int a=sc.nextInt();
        Scanner sb=new Scanner(System.in);
        System.out.println("请输入第二个和尚身高：");
        int b=sb.nextInt();
        Scanner sa=new Scanner(System.in);
        System.out.println("请输入第三个和尚身高：");
        int c=sa.nextInt();
        int d=a>b? a:b;
        int f=c>d? c:d;
        System.out.println("最高身高为:"+f);

    }
}