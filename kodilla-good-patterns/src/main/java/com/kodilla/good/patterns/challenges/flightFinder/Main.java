package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightFinder flightFinder = new DomesticFlightFinder();

        flightFinder.flightsFrom("Warszawa");
        flightFinder.flightsFrom("Wroclaw");

        flightFinder.indirectFlight("Wroclaw", "Warszawa", "Gdansk");

    }
}
