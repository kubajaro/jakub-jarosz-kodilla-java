package com.kodilla.good.patterns.challenges.onlineShop;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    public static List<Product> orderedProducts(){
        Product product1 = new Product("Shoes", "Nike", "F90", 001, false);
        Product product2 = new Product("Food", "Bakery", "Classic bread", 002, true);
        Product product3 = new Product("Computer games", "Rockstar", "GTA", 001, true);
        Product product4 = new Product("Computer keyboards", "Logitech", "K90", 9999, true);
        Product product5 = new Product("Headphones", "JBL", "233", 98283, false);

        List<Product> firstOrder = new ArrayList<>();
        firstOrder.add(product1);
        firstOrder.add(product2);
        firstOrder.add(product3);
        firstOrder.add(product4);
        firstOrder.add(product5);

        return firstOrder;
    }

    public OrderRequest retrieve(){
        Customer customer = new Customer("Jan", "Kowalski", "Wroclaw");
        Order order = new Order(customer, 1222, "Received", orderedProducts());

        return new OrderRequest(customer, order);
    }

}
