package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopSupplier implements Supplier {
    private String name;
    private char stock;
    private int number;

    public ExtraFoodShopSupplier(String name, char stock, int number) {
        this.name = name;
        this.stock = stock;
        this.number = number;
    }

    @Override
    public void process(Order order) {
        System.out.println("order processed in shop: " + name);
        order.setProcessed(true);
    }
}
