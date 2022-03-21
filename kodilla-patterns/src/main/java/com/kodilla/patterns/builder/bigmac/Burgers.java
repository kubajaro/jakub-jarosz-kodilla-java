package com.kodilla.patterns.builder.bigmac;

public class Burgers {
    private int burgers;

    public Burgers() {
    }

    public Burgers(int burgers) {
        this.burgers = burgers;
    }

    public int getBurgers() {
        return burgers;
    }

    public void setBurgers(int burgers) {
        this.burgers = burgers;
    }

    @Override
    public String toString() {
        return "Burgers{" +
                "burgers=" + burgers +
                '}';
    }
}
