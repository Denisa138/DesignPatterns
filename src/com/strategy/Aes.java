package com.strategy;

public class Aes implements EncrypthionAlgorithm{

    @Override
    public void encrypthion() {
        System.out.println("Encrypthing message using AES.");
    }
}
