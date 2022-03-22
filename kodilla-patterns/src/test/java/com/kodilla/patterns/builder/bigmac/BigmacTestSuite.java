package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void bigmacBuilderTest() {
        //given
        //when
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bread(Bread.BUN)
                .burgers(3)
                .sauce(Sauce.BBQ)
                .ingredientsList(Ingredients.CHEESE)
                .ingredientsList(Ingredients.CHILLI)
                .ingredientsList(Ingredients.MUSHROOMS)
                .build();

        System.out.println(bigmac);

        assertEquals(Bread.BUN, bigmac.getBread().getBread());
        assertEquals(3, bigmac.getBurgers().getBurgers());
        assertEquals(Sauce.BBQ, bigmac.getSauce().getSauce());
        assertEquals(3, bigmac.getIngredients().size());
    }
}
