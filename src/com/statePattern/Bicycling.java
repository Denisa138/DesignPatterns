package com.statePattern;

public class Bicycling implements  TravelMode{
    @Override
    public Bicycling getEta() {
        System.out.println("bicycling");

        return new Bicycling();
    }

    @Override
    public Bicycling getDir() {
        System.out.println("stanga");

        return new Bicycling();
    }
}
