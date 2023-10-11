package com.bootcoding.multithreading.store.book;

public class Book {
    int id;
    String title;
    String author;
    double price;

    public Book(int id, String title, String author, double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void print(){
        System.out.println("Book -> Title:"+ title + ", Author: "+ author + ", Price:" + price);
    }
}
