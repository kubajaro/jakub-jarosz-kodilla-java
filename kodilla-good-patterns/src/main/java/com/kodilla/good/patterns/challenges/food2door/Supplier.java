package com.kodilla.good.patterns.challenges.food2door;

public class Supplier {
    private String name;
    private int supplierNumber;

    public Supplier(String name, int supplierNumber) {
        this.name = name;
        this.supplierNumber = supplierNumber;
    }

    public String getName() {
        return name;
    }

    public int getSupplierNumber() {
        return supplierNumber;
    }
}
