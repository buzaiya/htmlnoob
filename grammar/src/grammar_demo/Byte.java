package grammar_demo;

public class Byte {
    public static void main(String[] args){
        int password=751248;
        int key=7;
        System.out.println("原密码"+password);
        password=password<<key;
        System.out.println("经过左移加密的结果是："+password);
        password=password>>key;
        System.out.println("经过右移加密的结果是："+password);
    }
}