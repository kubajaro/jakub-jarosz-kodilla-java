package com.kodilla.patterns2.decorator.pizza;

public abstract class AbstractPizza implements PizzaBaker {
    private PizzaBaker pizzaBaker;

    public AbstractPizza(PizzaBaker pizzaBaker) {
        this.pizzaBaker = pizzaBaker;
    }

    @Override
    public String addIngredient() {
        return pizzaBaker.addIngredient();
    }

    @Override
    public int getPrice() {
        return pizzaBaker.getPrice();
    }
}
