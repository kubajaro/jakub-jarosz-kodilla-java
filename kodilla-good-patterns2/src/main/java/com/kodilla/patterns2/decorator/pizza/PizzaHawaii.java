package com.kodilla.patterns2.decorator.pizza;

public class PizzaHawaii extends AbstractPizza{
    public PizzaHawaii(PizzaBaker pizzaBaker) {
        super(pizzaBaker);
    }

    @Override
    public String addIngredient() {
        return super.addIngredient() + " pineapple, ham";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }
}
