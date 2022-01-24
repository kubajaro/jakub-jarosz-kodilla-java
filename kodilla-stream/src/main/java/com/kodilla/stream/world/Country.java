package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal countryPopulation;

    public Country(BigDecimal countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public BigDecimal getCountryPopulation() {
        return countryPopulation;
    }
}
