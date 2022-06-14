package com.kodilla.patterns2.decorator.pizza;

public class PizzaVege extends AbstractPizza {
    public PizzaVege(PizzaBaker pizzaBaker) {
        super(pizzaBaker);
    }

    @Override
    public String addIngredient() {
        return super.addIngredient() + " aubergine, paprika, tomatoes";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 13;
    }
}
