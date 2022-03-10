package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.List;

public class FlightListPrinter {

    public static void printList(List<Flight> flights) {
        System.out.println("Found FLights:");
        for(int i = 0; i < flights.size(); i++)
            System.out.println(flights.get(i).toString());
    }

}
