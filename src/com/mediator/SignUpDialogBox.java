package com.mediator;

public class SignUpDialogBox{
    private Button signUpButton = new Button(false);
    private TextBox user = new TextBox("");
    private TextBox password = new TextBox("");
    private CheckBox agree = new CheckBox(false);

    public SignUpDialogBox(){
        user.attachObserver(this::controlChanged);
        password.attachObserver(this::controlChanged);
        agree.attachObserver(()->controlChanged());
    }

    private void controlChanged(){
        signUpButton.setAvailable(isActive());
    }

    private boolean isActive(){
        return !password.isEmpty() && !user.isEmpty() && agree.getAgree();
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + signUpButton.getAvailable());

        // The user enters their username, the button is still disabled
        user.setInformation("username");
        System.out.println("After setting the username: " + signUpButton.getAvailable());

        // The user enters their password, the button is still disabled
        password.setInformation("password");
        System.out.println("After setting the password: " + signUpButton.getAvailable());

        // The agrees to the terms, the button becomes enabled
        agree.setAgree(true);
        System.out.println("After agreeing to terms: " + signUpButton.getAvailable());

        // The user removes the password, the button becomes disabled
        password.setInformation("");
        System.out.println("After removing the password: " + signUpButton.getAvailable());

        // The user enters the password again, the button becomes enabled
        password.setInformation("password");
        System.out.println("After re-setting the password: " + signUpButton.getAvailable());
    }
}
