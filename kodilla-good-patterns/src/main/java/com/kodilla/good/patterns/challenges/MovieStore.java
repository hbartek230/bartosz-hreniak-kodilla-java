package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {

    private static final String IRONMAN_PL = "Żelazny człowiek";
    private static final String IRONMAN_ENG = "Iron Man";
    private static final String AVENGERS_PL = "Mściciele";
    private static final String AVENGERS_ENG = "Avengers";
    private static final String FLASH_PL = "Błyskawica";
    private static final String FLASH_ENG = "Flash";
    private static final String IRONMAN_SHORT = "IM";
    private static final String AVENGERS_SHORT = "AV";
    private static final String FLASH_SHORT = "FL";

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add(IRONMAN_PL);
        ironManTranslations.add(IRONMAN_ENG);

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add(AVENGERS_PL);
        avengersTranslations.add(AVENGERS_ENG);

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add(FLASH_PL);
        flashTranslations.add(FLASH_ENG);

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put(IRONMAN_SHORT, ironManTranslations);
        booksTitlesWithTranslations.put(AVENGERS_SHORT, avengersTranslations);
        booksTitlesWithTranslations.put(FLASH_SHORT, flashTranslations);

        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {
        MovieStore movies = new MovieStore();

        String tested = movies.getMovies()
                .values()
                .stream()
                .flatMap(Collection::parallelStream)
                .map(String::toString)
                .collect(Collectors.joining("!"));
        System.out.println(tested);
    }
}
