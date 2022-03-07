package com.kodilla.good.patterns.challenges.onlineShop;

public class Customer {
    private String name;
    private String lastname;
    private String deliveryAddress;

    public Customer(String name, String lastname, String deliveryAddress) {
        this.name = name;
        this.lastname = lastname;
        this.deliveryAddress = deliveryAddress;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

}
