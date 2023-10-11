package com.bootcoding.multithreading.letters;

public class AlphabetThread extends Thread{
    public void run(){

        for(int i = 0; i < 100000000; i++) {
            System.out.println("Alphabet Thread is executed!");
        }
    }
}
