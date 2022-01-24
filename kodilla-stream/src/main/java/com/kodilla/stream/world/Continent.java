package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    public Country country;
    private final List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    public void assignCountry(Country country){
        countries.add(country);
    }
}
