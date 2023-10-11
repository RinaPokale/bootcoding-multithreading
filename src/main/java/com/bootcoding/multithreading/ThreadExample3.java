package com.bootcoding.multithreading;

import com.bootcoding.multithreading.mythread.FibonacciThread;
import com.bootcoding.multithreading.mythread.PalindromeThread;
import com.bootcoding.multithreading.mythread.PrimeNumberThread;

public class ThreadExample3 {
    public static void main(String[] args) {
        Thread t1 = new FibonacciThread();
        t1.start();

        Thread t2 = new PalindromeThread();
        t2.start();

        Thread t3 = new PrimeNumberThread();
        t3.start();
    }
}
