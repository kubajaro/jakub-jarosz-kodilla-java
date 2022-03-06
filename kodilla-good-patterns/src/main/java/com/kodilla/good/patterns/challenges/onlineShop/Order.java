package com.kodilla.good.patterns.challenges.onlineShop;

import java.util.List;

public class Order {
    private Customer customer;
    private int orderNumber;
    private String orderStatus;
    List<Product> orderedProducts;

    public Order(Customer customer, int orderNumber, String orderStatus, List<Product> orderedProducts) {
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
        this.orderedProducts = orderedProducts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderedProducts(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }
}
