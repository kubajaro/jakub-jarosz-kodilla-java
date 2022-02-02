package com.kodilla.exception.test;

import java.util.Map;

import static com.kodilla.exception.test.FlightsMap.flightsMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightsMap = flightsMap();

        if(flightsMap.containsKey(flight.getDepartureAirport()) && flightsMap.containsKey(flight.getArrivalAirport())){

            if(flightsMap.get(flight.getArrivalAirport()) && flightsMap.get(flight.getDepartureAirport())){
                System.out.println("The flight is possible");
            }else{
                throw new RouteNotFoundException("ERROR! Flight not possible");
            }

        }else{
            throw new RouteNotFoundException("ERROR! Arrival or departure city was not found!");
        }

    }
}
