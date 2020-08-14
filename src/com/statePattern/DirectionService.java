package com.statePattern;

public class DirectionService {
    private TravelMode travelMode;

    public Object getEta() {
       return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDir();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
