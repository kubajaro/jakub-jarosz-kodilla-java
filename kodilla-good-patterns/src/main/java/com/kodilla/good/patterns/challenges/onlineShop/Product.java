package com.kodilla.good.patterns.challenges.onlineShop;

public class Product {
    private String category;
    private String producer;
    private String model;
    private long serialNumber;

    public Product(String category, String producer, String model, long serialNumber) {
        this.category = category;
        this.producer = producer;
        this.model = model;
        this.serialNumber = serialNumber;
    }

}
