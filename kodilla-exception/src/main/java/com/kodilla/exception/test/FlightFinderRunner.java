package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight unvailableFlight = new Flight("Wroclaw", "Krakow");

        try{
            flightFinder.findFlight(unvailableFlight);
        }catch(RouteNotFoundException e){
            System.out.println("We have an error... the flight could not be found");
        }
    }
}
