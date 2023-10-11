package com.bootcoding.multithreading.store.book;

import com.bootcoding.multithreading.utils.AuthorNameGenerator;
import com.bootcoding.multithreading.utils.BookNameGenerator;
import com.bootcoding.multithreading.utils.IDGenerator;
import com.bootcoding.multithreading.utils.PriceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookService implements Runnable{
    private List<Book> books = new ArrayList<>();
    int quantity;
    public BookService(int q){
        this.quantity= q;
    }

    @Override
    public void run() {
        try {
            createBook(quantity);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void createBook(int quantity) throws InterruptedException{
        for(int i = 0; i < quantity; i++){
            books.add(new Book(IDGenerator.id(), BookNameGenerator.getName(),
                    AuthorNameGenerator.getName(), PriceGenerator.getPrice()));
            System.out.println(Thread.currentThread().getName() +"| Book  " + bookCount());
            Thread.sleep(500);
        }
    }

    public int bookCount(){
        return books.size();
    }

    public Book getBooksInStock(){
        return books.get(new Random().nextInt(books.size()));
    }


    private Random random = new Random();
}
