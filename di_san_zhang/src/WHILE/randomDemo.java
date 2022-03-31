package WHILE;

import java.util.Random;

public class randomDemo {
    public static void main(String[]agrs){
        Random r=new Random();
        for (int i=0;i<10;i++){
            int number=r.nextInt(10);
            System.out.println("number:"+number);
        }
        int x=r.nextInt(100)+1;
        System.out.println(x);
    }
}
