package com.bootcoding.multithreading.mythread;

public class PalindromeThread extends Thread{
    public void run(){
        System.out.println("isPalindrome:- " +isPalindrome(121));
        System.out.println("isPalindrome:- " +isPalindrome(123));
    }

    public boolean isPalindrome(int n){ //121
        int num = n, rem = 0;
        while(n!=0){
            rem = (n%10) + rem*10;
            n /= 10;
        }
//        System.out.println(rem);

        if(num == rem)
            return true;

        return false;

    }
}
