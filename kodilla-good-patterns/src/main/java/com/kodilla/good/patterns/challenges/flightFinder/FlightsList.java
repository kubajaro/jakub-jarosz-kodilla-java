package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.HashSet;
import java.util.Set;

public class FlightsList {

    public static Set<Flight> flights(){
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Wroclaw", "Warszawa"));
        flights.add(new Flight("Wroclaw", "Krakow"));
        flights.add(new Flight("Krakow", "Warszawa"));
        flights.add(new Flight("Krakow", "Wroclaw"));
        flights.add(new Flight("Warszawa", "Poznan"));
        flights.add(new Flight("Warszawa", "Gdansk"));
        flights.add(new Flight("Gdansk", "Poznan"));
        flights.add(new Flight("Gdanks", "Wroclaw"));
        flights.add(new Flight("Poznan", "Gdansk"));
        flights.add(new Flight("Poznan", "Wroclaw"));

        return flights;
    }

}
