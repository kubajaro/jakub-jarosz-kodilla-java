package com.kodilla.patterns.builder.bigmac;

public class Ingredients {
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String PICKLE = "PICKLE";
    public static final String CHILLI = "CHILLI";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMPS = "SHRIMPS";
    public static final String CHEESE = "CHEESE";
    private String ingredient;

    public Ingredients() {
    }

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

    @Override
    public String toString() {
        return "Ingredients{" +
                "ingredient='" + ingredient + '\'' +
                '}';
    }
}
