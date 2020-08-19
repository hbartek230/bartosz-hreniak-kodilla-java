package com.kodilla.patterns2.oberver.homework;

public interface Observable {
    void registerObserver(Observer observer);

    void notifyObserver();

    void deleteObserver(Observer observer);
}
