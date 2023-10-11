package com.bootcoding.multithreading.mythread;

public class FibonacciThread extends Thread{
   public void run(){
       System.out.println("Fibonacci of nth term:-" + fib(5));
   }

    public int fib(int n) { // 0, 1, 1, 2, 3, 5, 8
       if(n == 0 || n == 1)
           return n;

       return fib(n-1) + fib(n-2);
    }

}



