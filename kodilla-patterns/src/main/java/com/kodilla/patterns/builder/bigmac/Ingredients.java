package com.kodilla.patterns.builder.bigmac;

public class Ingredients {
    private static final String LETTUCE = "LETTUCE";
    private static final String ONION = "ONION";
    private static final String PICKLE = "PICKLE";
    private static final String CHILLI = "CHILLI";
    private static final String MUSHROOMS = "MUSHROOMS";
    private static final String SHRIMPS = "SHRIMPS";
    private static final String CHEESE = "CHEESE";
    private final String ingredient;

    public Ingredients(String ingredient) {
        if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(PICKLE) || ingredient.equals(CHILLI)
        || ingredient.equals(MUSHROOMS) || ingredient.equals(SHRIMPS) || ingredient.equals(CHEESE)) {
            this.ingredient = ingredient;
        } else {
            throw new IllegalStateException("INGREDIENT NOT VALID");
        }
    }

    public String getIngredient() {
        return ingredient;
    }
}
