package com.itcpay.jvm;

/**
 * @date 2020-5-26 06:22:02
 */
public class MyObject {

    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.getClass().getClassLoader());

        MyObject myObject = new MyObject();
        System.out.println(myObject.getClass().getClassLoader().getParent().getParent());
        System.out.println(myObject.getClass().getClassLoader().getParent());
        System.out.println(myObject.getClass().getClassLoader());
    }

}
