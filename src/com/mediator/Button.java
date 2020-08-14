package com.mediator;

public class Button extends UIControl{
    private Boolean isAvailable;

    public Button(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
        notifyAllObservers();
    }
}
