package com.bootcoding.multithreading.letters;

public class NumberThread extends Thread{
    public void run(){
        for(int i = 0; i < 100000000; i++) {
            System.out.println("Number Task is executed!");
        }
    }
}
