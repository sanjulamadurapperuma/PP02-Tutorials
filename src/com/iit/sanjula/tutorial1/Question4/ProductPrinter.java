package com.iit.sanjula.tutorial1.Question4;

public class ProductPrinter {
    public static void main(String[] args){
        Product product1 = new Product("SmartPhone", 250.00);
        Product product2 = new Product("Laptop", 2300.00);
        System.out.println("Name of Product 1 : " + product1.getName());
        System.out.println("Price of Product 1 : $" + product1.getPrice());
        System.out.println("Name of Product 2 : " + product2.getName());
        System.out.println("Price of Product 2 : $" + product2.getPrice());

        product1.reducePrice(product1.getPrice());
        product2.reducePrice(product2.getPrice());

        System.out.println("Name of Product 1 : " + product1.getName());
        System.out.println("Discounted price of Product 1 : $" + product1.getPrice());
        System.out.println("Name of Product 2 : " + product2.getName());
        System.out.println("Discounted price of Product 2 : $" + product2.getPrice());
    }
}
