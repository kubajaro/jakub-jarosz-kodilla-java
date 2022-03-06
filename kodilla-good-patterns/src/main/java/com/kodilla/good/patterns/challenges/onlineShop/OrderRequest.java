package com.kodilla.good.patterns.challenges.onlineShop;

public class OrderRequest {
    private Customer customer;
    private Order order;

    public OrderRequest(Customer customer, Order order) {
        this.customer = customer;
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
