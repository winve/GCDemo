package java.lang;

public class String {

    // 类加载器的双亲委派机制   保证沙箱安全
    // 在类 java.lang.String 中找不到 main 方法
    public static void main(String[] args) {
        System.out.println("*****Hello World");
    }

}
