package com.bootcoding.multithreading.mythread;

public class NumberThread extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.println("Number Task is executed!");
        }
    }
}
