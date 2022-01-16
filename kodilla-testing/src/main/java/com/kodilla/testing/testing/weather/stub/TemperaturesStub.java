package com.kodilla.testing.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures{

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        stubResult.put("Wroclaw", 22.5);
        stubResult.put("Krakow", 25.7);
        stubResult.put("Katowice", 22.1);
        stubResult.put("Poznan", 19.5);
        stubResult.put("Gdansk", 21.0);

        return stubResult;
    }
}
