
package com.bootcoding.multithreading;

import com.bootcoding.multithreading.mythread.AlphabetThread;
import com.bootcoding.multithreading.mythread.NumberThread;
import com.bootcoding.multithreading.mythread.SpecialSymbolThread;

public class ThreadExample2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread t1 = new NumberThread();
        t1.start();
        Thread t2 = new AlphabetThread();
        t2.start();
        Thread t3 = new SpecialSymbolThread();
        t3.start();
    }
}
