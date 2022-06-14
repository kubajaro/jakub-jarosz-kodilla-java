package com.kodilla.patterns2.decorator.pizza;

public class PizzaMargherita implements PizzaBaker {

    @Override
    public String addIngredient() {
        return "Pizza with tomato sauce and cheese";
    }

    @Override
    public int getPrice() {
        return 15;
    }
}
