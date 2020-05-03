package com.kodilla.good.patterns.arilines;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Flights {

    private final Airport waw = new Airport("Warszawa");
    private final Airport gdn = new Airport("Gdańsk");
    private final Airport krk = new Airport("Kraków");
    private final Airport rze = new Airport("Rzeszów");
    private final Airport poz = new Airport("Poznań");
    private final Airport szc = new Airport("Szczecin");
    private final HashMap<Airport, List<Airport>> availableFlights;

    public Flights(){
        availableFlights = new HashMap<>();
    }

    public HashMap<Airport, List<Airport>> createFlights() {
        availableFlights.put(waw, Arrays.asList(gdn, krk, rze, poz, szc));
        availableFlights.put(gdn, Arrays.asList(waw, krk, poz));
        availableFlights.put(krk, Arrays.asList(waw, gdn, poz, szc));
        availableFlights.put(rze, Arrays.asList(waw, krk));
        availableFlights.put(poz, Arrays.asList(waw, gdn, krk, szc));
        availableFlights.put(szc, Arrays.asList(waw, poz, gdn));

        return availableFlights;
    }


}
