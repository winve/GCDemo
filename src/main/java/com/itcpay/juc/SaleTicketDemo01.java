package com.itcpay.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 题目：三个售票员     卖出      30张票
 * <p>
 * 在高内聚低耦合前提下， 线程       操作          资源类
 */
public class SaleTicketDemo01 {

    public static void main(String[] args) {
        final Ticket ticket = new Ticket();

        // Thread(Runnable target, String name)

        new Thread(() -> {for (int i = 0; i <= 40; i++) ticket.sale();}, "A").start();
        new Thread(() -> {for (int i = 0; i <= 40; i++) ticket.sale();}, "B").start();
        new Thread(() -> {for (int i = 0; i <= 40; i++) ticket.sale();}, "C").start();

        /*new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 40; i++) {
                    ticket.sale();
                }
            }
        }, "A").start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 40; i++) {
                    ticket.sale();
                }
            }
        }, "B").start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 40; i++) {
                    ticket.sale();
                }
            }
        }, "C").start();*/

    }

}

// 资源类
class Ticket {

    private int number = 30;

    Lock lock = new ReentrantLock();

    public void sale() {
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "\t卖出第：" + (number--) + "\t还剩下：" + number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}