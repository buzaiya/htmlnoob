package Case3;

public class case3_12 {
    public static void main(String[]agrs){
        for (int i=1;i<=4;i++){
            for (int j=1;j<=10;j++){
                if (j==1||j==10){
                    System.out.print("！");
                    continue;
                }
                System.out.print("O ");
            }
            System.out.println();
        }
    }
}
