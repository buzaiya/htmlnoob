package case2;

public class case2_03 {
    public static void main(String[] args){
        byte b=127;
        int i=150;
        float f=452.12f;
        char c=10;
        double d=45.45646;

        System.out.println("byte与float数据进行运算结果："+(b+f));
        System.out.println("byte与int数据进行运算结果："+(b*i));
        System.out.println("byte与double数据进行运算结果："+(b/d));
        System.out.println("char与float数据进行运算结果："+(c+f));
    }
}