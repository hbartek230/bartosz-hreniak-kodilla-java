package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {
    private final String continentName;
    private final Set<Country> continent = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", continent=" + continent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName);
    }

    public void addCountry(Country country){
        continent.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getContinent() {
        return continent;
    }
}
