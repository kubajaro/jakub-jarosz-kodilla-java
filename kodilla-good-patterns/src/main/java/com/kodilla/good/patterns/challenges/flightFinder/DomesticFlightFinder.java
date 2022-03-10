package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DomesticFlightFinder implements FlightFinder {
    private Set<Flight> flightSet = FlightsList.flights();

    @Override
    public List<Flight> flightsFrom(String departureCity) {
        return null;
    }

    @Override
    public List<Flight> flightsTo(String arrivalCity) {
        return null;
    }

    @Override
    public String indirectFlight(String departureCity, String stopOver, String arrivalCity) {
        return null;
    }
}
