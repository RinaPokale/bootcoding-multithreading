package com.bootcoding.multithreading.store.bottle;

public class Bottle {
    int id;
    String brand;
    String color;
    double price;

    public Bottle(int id, String brand, String color, double price){
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void print(){
        System.out.println("Bottle -> Brand:"+ brand + ", Color: "+ color + ", Price:" + price);
    }
}
