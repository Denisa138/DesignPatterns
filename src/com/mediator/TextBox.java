package com.mediator;

public class TextBox extends UIControl{
    private String information;

    public TextBox(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
        notifyAllObservers();
    }

    public boolean isEmpty() {
        return information == null || information.isEmpty();
    }
}
