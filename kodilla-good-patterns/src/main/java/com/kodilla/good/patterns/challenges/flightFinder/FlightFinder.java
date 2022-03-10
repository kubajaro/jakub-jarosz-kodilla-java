package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.List;

public interface FlightFinder {
    List<Flight> flightsFrom(String departureCity);
    List<Flight> flightsTo(String arrivalCity);
    String indirectFlight(String departureCity, String stopOver, String arrivalCity);
}
