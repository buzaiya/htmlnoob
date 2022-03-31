package Case3;

public class case3_08 {
    public static void main(String[]agrs){
        for(int i=100;i<=999;i++){
            int a=i%10;
            int b=i/10%5;
            int c=i/10/10%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }

    }
}
