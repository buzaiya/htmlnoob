package WHILE;

public class BreakTest01 {
    public static void main(String[]args){
        for (int i=1;i<20;i++){
            if (i%2==0){
                System.out.println(i);
                break;
            }
        }
        System.out.println("---end---");
    }
}