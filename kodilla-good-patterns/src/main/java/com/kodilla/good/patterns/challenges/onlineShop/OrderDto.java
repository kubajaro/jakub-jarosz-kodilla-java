package com.kodilla.good.patterns.challenges.onlineShop;

public class OrderDto {
    private String customerName;
    private String customerLastname;

    public OrderDto(String customerName, String customerLastname) {
        this.customerName = customerName;
        this.customerLastname = customerLastname;
    }
}
