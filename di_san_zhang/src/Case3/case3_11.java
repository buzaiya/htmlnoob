package Case3;

public class case3_11 {
    public static void main(String[]args){
       loop: for (int i=1;i<=8;i++) {
            for (int j = 1; j <= 8; j++) {
                    System.out.println("第" + i + "排,第" + j + "列:" + ((i-1)*8+j));
                    if (i==2&&j==4){
                       break loop;
                    }
                }
            }
        }
    }

