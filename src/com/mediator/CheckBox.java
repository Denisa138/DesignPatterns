package com.mediator;

public class CheckBox extends UIControl{
     private Boolean isAgree;

    public CheckBox(Boolean isAgree) {
        this.isAgree = isAgree;
    }

    public Boolean getAgree() {
        return isAgree;
    }

    public void setAgree(Boolean agree) {
        isAgree = agree;
        notifyAllObservers();
    }
}
