package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class DomesticFlightFinder implements FlightFinder {
    private Set<Flight> flightSet = FlightsList.flights();
    private List<Flight> flightResult;

    @Override
    public List<Flight> flightsFrom(String departureCity) {
        flightResult = flightSet.stream().filter(flight -> flight.getDeparture().equals(departureCity))
                .collect(Collectors.toList());

        FlightListPrinter.printList(flightResult);

        return flightResult;
    }

    @Override
    public List<Flight> flightsTo(String arrivalCity) {
        flightResult = flightSet.stream().filter(flight -> flight.getArrival().equals(arrivalCity))
                .collect(Collectors.toList());

        FlightListPrinter.printList(flightResult);

        return flightResult;
    }

    @Override
    public String indirectFlight(String departureCity, String stopOver, String arrivalCity) {
       Flight firstFlight = flightSet.stream().filter(flight -> flight.equals(new Flight(departureCity, stopOver))).findFirst().get();
       Flight secondFlight = flightSet.stream().filter(flight -> flight.equals(new Flight(stopOver, arrivalCity))).findFirst().get();

        System.out.println("Found flights: \nFirst: " + firstFlight.getDeparture() + " to " + firstFlight.getArrival()
                + "\nSecond: " + secondFlight.getDeparture() + " to " + secondFlight.getArrival());

       if(firstFlight != null && secondFlight != null){
            return flightResult.toString() + " " + secondFlight.toString();
       }else {
           System.out.println("No connection found...");
           return "No connection found...";
       }
    }
}
