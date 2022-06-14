package com.kodilla.patterns2.decorator.pizza;

public class PizzaPiccante extends AbstractPizza {
    public PizzaPiccante(PizzaBaker pizzaBaker) {
        super(pizzaBaker);
    }

    @Override
    public String addIngredient() {
        return super.addIngredient()+ " hot salami, jalapenio, onion, olives";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 15;
    }
}
