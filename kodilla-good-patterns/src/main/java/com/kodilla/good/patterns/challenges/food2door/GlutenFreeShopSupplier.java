package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShopSupplier implements Supplier {
    private String name;
    private int doorNumber;
    private int number;

    public GlutenFreeShopSupplier(String name, int doorNumber, int number) {
        this.name = name;
        this.doorNumber = doorNumber;
        this.number = number;
    }

    @Override
    public void process(Order order) {
        System.out.println("order processed in shop: " + name);
        order.setProcessed(true);
    }
}
