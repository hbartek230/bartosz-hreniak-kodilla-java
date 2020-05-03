package com.kodilla.good.patterns.arilines;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearcher {

    public List<Airport> searchFlightFrom(HashMap<Airport, List<Airport>> availableFlights, String flightFrom) {
        return availableFlights.entrySet()
                .stream()
                .filter(flights -> flights.getKey().getAirportName().equals(flightFrom))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Airport> searchFlightTo(HashMap<Airport, List<Airport>> availableFlights, String flightTo) {
        return availableFlights.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(new Airport(flightTo)))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<Airport> searchFlightBetween(HashMap<Airport, List<Airport>> availableFlights, String flightFrom,
                                            String flightTo){
        List<Airport> airportsBetweenFrom = searchFlightFrom(availableFlights, flightFrom);
        List<Airport> airportsBetweenTo = searchFlightTo(availableFlights, flightTo);
        List<Airport> airportsBetween = new ArrayList<>();

        for (Airport airportFrom : airportsBetweenFrom) {
            for (Airport airportTo : airportsBetweenTo) {
                if (airportFrom == airportTo) {
                    airportsBetween.add(airportFrom);
                }
            }
        }
        return airportsBetween;
    }
}
