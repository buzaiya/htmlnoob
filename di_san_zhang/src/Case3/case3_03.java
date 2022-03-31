package Case3;

import java.util.Scanner;

public class case3_03 {
    public static void main(String[]args){
        System.out.println("请输入一个月份");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a){
            case 3:
            case 4:
            case 5:
                System.out.println("该月份属于春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("该月份属于夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("该月份属于秋季");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("该月份属于冬季");
                break;
                default:
                    System.out.println("此月分无效");
        }
    }
}
