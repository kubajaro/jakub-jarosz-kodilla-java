package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsMap {

    public static Map<String, Boolean> flightsMap(){
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Lisbon", true);
        flights.put("Porto", true);
        flights.put("Poznan", true);
        flights.put("Radom", false);
        flights.put("Modlin", false);
        flights.put("Paris", true);
        flights.put("Rome", true);
        flights.put("Berlin", true);
        flights.put("Madrid", true);
        flights.put("Prague", false);

        return flights;
    }
}
