package com.itcpay.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @date 2020-5-25 03:45:56
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());

        new Thread(futureTask, "A").start();

        Integer result = futureTask.get();
        System.out.println(result);
    }
}

class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("*****come in call method()");
        return 1024;
    }
}
