package com.bootcoding.multithreading;

import com.bootcoding.multithreading.mythread.NumberThread;

public class ThreadExample1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread t1 = new NumberThread();
        t1.start();
        Thread t2 = new NumberThread();
        t2.start();
        Thread t3 = new NumberThread();
        t3.start();
    }
}
