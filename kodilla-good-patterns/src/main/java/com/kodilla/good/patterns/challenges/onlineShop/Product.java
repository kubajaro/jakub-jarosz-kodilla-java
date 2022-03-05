package com.kodilla.good.patterns.challenges.onlineShop;

public class Product {
    private String category;
    private String producer;
    private String model;
    private long serialNumber;
    private boolean availability;

    public Product(String category, String producer, String model, long serialNumber, boolean availability) {
        this.category = category;
        this.producer = producer;
        this.model = model;
        this.serialNumber = serialNumber;
        this.availability = availability;
    }

    public String getCategory() {
        return category;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public boolean isAvailability() {
        return availability;
    }
}
