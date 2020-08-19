package com.kodilla.patterns2.oberver.forum;

public interface Observable {
    void registerObserver(Observer observer);

    void notifyObservers();

    void deleteObserver(Observer observer);
}
