package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetWorldPopulation(){
        //given
        Country poland = new Country(new BigDecimal(38000000));
        Country germany = new Country(new BigDecimal(83000000));
        Country italy = new Country(new BigDecimal(60000000));
        Country portugal = new Country(new BigDecimal(10000000));

        Country canada = new Country(new BigDecimal(38000000));
        Country usa = new Country(new BigDecimal(329000000));

        Continent europe = new Continent();
        europe.assignCountry(poland);
        europe.assignCountry(germany);
        europe.assignCountry(italy);
        europe.assignCountry(portugal);

        Continent northAmerica = new Continent();
        northAmerica.assignCountry(canada);
        northAmerica.assignCountry(usa);

        World world = new World();
        world.assignContinent(europe);
        world.assignContinent(northAmerica);

        //when
        BigDecimal result = world.getWorldPopulation();

        //then
        BigDecimal expectedPopulation = new BigDecimal(558000000);
        assertEquals(expectedPopulation, result);
    }
}
