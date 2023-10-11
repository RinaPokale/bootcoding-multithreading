package com.bootcoding.multithreading.store;

import com.bootcoding.multithreading.mythread.AlphabetThread;
import com.bootcoding.multithreading.mythread.NumberThread;
import com.bootcoding.multithreading.mythread.SpecialSymbolThread;
import com.bootcoding.multithreading.store.bag.BagService;
import com.bootcoding.multithreading.store.book.BookService;
import com.bootcoding.multithreading.store.bottle.BottleService;

public class Shopkeeper {
    public static void main(String[] args) {
        // Using Thread
        Thread t1 = new NumberThread();
        t1.start();
        Thread t2 = new AlphabetThread();
        t2.start();
        Thread t3 = new SpecialSymbolThread();
        t3.start();

        // Using Runnable
        Thread t11 = new Thread(new BookService(10000000));
        Thread t22 = new Thread(new BottleService(10000000));
        Thread t33 = new Thread(new BagService(10000000));
        t11.start();
        t22.start();
        t33.start();

    }
}
