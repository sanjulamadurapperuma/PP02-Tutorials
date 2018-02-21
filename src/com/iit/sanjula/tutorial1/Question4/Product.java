package com.iit.sanjula.tutorial1.Question4;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void reducePrice(double originalPrice){
        originalPrice -= 5.00;
        price = originalPrice;
    }
}
