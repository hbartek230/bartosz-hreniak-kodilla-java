package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    HashMap<String, Boolean> flightMap;


    public FlightFinder() {
        flightMap = new HashMap<>();
        flightMap.put("GER", true);
        flightMap.put("POL", false);
        flightMap.put("USA", true);
        flightMap.put("SPA", true);
        flightMap.put("ITA", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return airportExist(flight.getArrivalAirport()) && airportExist(flight.getDepartureAirport());
    }

    public boolean airportExist(String airportName) throws RouteNotFoundException {
        if (flightMap.containsKey(airportName)) {
            return flightMap.get(airportName);
        } else {
            throw new RouteNotFoundException("Airport doesn`t exist");
        }
    }
}
