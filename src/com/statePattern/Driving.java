package com.statePattern;

public class Driving implements TravelMode{

    @Override
    public Driving getEta() {
        System.out.println("distanta masina");
        return new Driving();
    }

    @Override
    public Driving getDir() {
        System.out.println("dreapta");
        return new Driving();
    }
}
