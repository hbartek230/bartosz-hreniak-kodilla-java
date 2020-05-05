package com.kodilla.good.patterns.arilines;

public class MainApplication {

    public static void main(String[] args) {
        Flights flights = new Flights();
        FlightSearcher searcher = new FlightSearcher();

        System.out.println("Loty z Warszawy: \n" + searcher.searchFlightFrom(flights.createFlights(),
                "Warszawa"));
        System.out.println("Loty do Gdańska: \n" + searcher.searchFlightTo(flights.createFlights(),
                "Gdańsk"));
        System.out.println("Z Rzeszowa do Szczecina możesz dostać się przez: \n" +
                searcher.searchFlightBetween(flights.createFlights(), "Rzeszów", "Szczecin"));
    }
}
