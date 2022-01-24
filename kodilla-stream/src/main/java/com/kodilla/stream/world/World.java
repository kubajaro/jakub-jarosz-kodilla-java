package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private  List<Continent> worldList = new ArrayList<>();

    public void assignContinent(Continent continent){
        worldList.add(continent);
    }

    public BigDecimal getWorldPopulation(){
        BigDecimal result = worldList.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getCountryPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));

        return result;
    }
}
