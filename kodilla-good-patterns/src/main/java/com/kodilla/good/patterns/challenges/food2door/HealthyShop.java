package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Supplier {
    private String name;
    private int number;

    public HealthyShop(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void process(Order order) {

    }
}
