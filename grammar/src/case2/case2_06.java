package case2;

public class case2_06 {
    public static void main(String[] agrs){
        int height1=150;
        int height2=210;
        int height3=165;
        int tempheight=height1>height2? height1:height2;
        int max=tempheight>height3? tempheight:height3;
        System.out.println("max："+max);
    }
}