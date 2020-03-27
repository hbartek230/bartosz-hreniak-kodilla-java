package com.kodilla.exception.test;

public class TestFlights {
    public static void main(String[] args) {
        FlightFinder finder = new FlightFinder();

        Flight flight1 = new Flight("GER", "POL");
        Flight flight2 = new Flight("USA", "SPA");
        Flight flight3 = new Flight("ITA", "UKR");

        try {
            boolean canFlight = finder.findFlight(flight1);
            System.out.println("Flight from " + flight1.getArrivalAirport() + " to " + flight1.getDepartureAirport() +
                    " can be realize? " + canFlight);
        } catch (RouteNotFoundException e){
            System.out.println("Flight from " + flight1.getArrivalAirport() + " to " + flight1.getDepartureAirport() +
                    " can`t be realize. " + "Put correct airport name");
        }

        try {
            boolean canFlight = finder.findFlight(flight2);
            System.out.println("Flight from " + flight2.getArrivalAirport() + " to " + flight2.getDepartureAirport() +
                    " can be realize? " + canFlight);
        } catch (RouteNotFoundException e){
            System.out.println("Flight from " + flight2.getArrivalAirport() + " to " + flight2.getDepartureAirport() +
                    " can`t be realize. " + "Put correct airport name");
        }

        try {
            boolean canFlight = finder.findFlight(flight3);
            System.out.println("Flight from " + flight3.getArrivalAirport() + " to " + flight3.getDepartureAirport() +
                    " can be realize? " + canFlight);
        } catch (RouteNotFoundException e){
            System.out.println("Flight from " + flight3.getArrivalAirport() + " to " + flight3.getDepartureAirport() +
                    " can`t be realize. " + "Put correct airport name");
        }
    }
}
