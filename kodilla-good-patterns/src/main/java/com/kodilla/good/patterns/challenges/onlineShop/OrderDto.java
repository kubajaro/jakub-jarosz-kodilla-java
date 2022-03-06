package com.kodilla.good.patterns.challenges.onlineShop;

import java.util.List;

public class OrderDto {
    private String customerName;
    private String customerLastname;
    private int orderNumber;
    private List<Product> productList;

    public OrderDto(String customerName, String customerLastname, int orderNumber, List<Product> productList) {
        this.customerName = customerName;
        this.customerLastname = customerLastname;
        this.orderNumber = orderNumber;
        this.productList = productList;
    }
}
