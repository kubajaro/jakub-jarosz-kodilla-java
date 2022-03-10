package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightFinder flightFinder = new DomesticFlightFinder();

        List<Flight> flightList = flightFinder.flightsFrom("Warszawa");

        for(int i = 0; i < flightList.size(); i++){
            System.out.println(flightList.get(i).toString());
        }

    }
}
