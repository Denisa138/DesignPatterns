package com.strategy;

public class Des implements EncrypthionAlgorithm{

    @Override
    public void encrypthion() {
        System.out.println("Encrypthing message using DES.");
    }
}
