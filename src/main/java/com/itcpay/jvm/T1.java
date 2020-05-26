package com.itcpay.jvm;

public class T1 {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        // Exception in thread "main" java.lang.IllegalThreadStateException
        // private native void start0();
        t1.start();
//        Thread.State
    }

}
