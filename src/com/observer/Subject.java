package com.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers()
    {
        //observers.stream().forEach(Observer o.update());
       for (Observer observer: observers) {
            observer.update();
        }
    }
}
