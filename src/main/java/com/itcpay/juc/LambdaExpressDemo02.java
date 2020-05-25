package com.itcpay.juc;

/**
 * 函数式编程
 * 1    拷贝小括号，写死右箭头，落地大括号
 * 2    @FunctionalInterface
 * 3    default
 * 4    static
 */
public class LambdaExpressDemo02 {
    public static void main(String[] args) {

        /*Foo foo = () -> {
            System.out.println("****Hello World*****");
        };
        foo.sayHello();*/

        Foo foo = (int x, int y) -> {
            return x + y;
        };
        System.out.println(foo.add(3, 5));

        System.out.println(foo.mul(2, 5));

        System.out.println(Foo.div(10, 2));
    }
}

@FunctionalInterface
interface Foo {
//    public void sayHello();
    public int add(int x, int y);

    public default int mul(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x/y;
    }
}