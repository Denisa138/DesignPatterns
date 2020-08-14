package com.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    public List<Observer> observers = new ArrayList<>();

    public void attachObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void dettachObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyAllObservers()
    {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
