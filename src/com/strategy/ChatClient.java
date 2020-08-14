package com.strategy;

public class ChatClient {
    private EncrypthionAlgorithm encrypthionAlgorithm;

    public ChatClient(EncrypthionAlgorithm encrypthionAlgorithm) {
        this.encrypthionAlgorithm = encrypthionAlgorithm;
    }

    public void chat()
    {
        if(encrypthionAlgorithm instanceof EncrypthionAlgorithm)
            encrypthionAlgorithm.encrypthion();
        else
            throw new UnsupportedOperationException("Encryphtion is not possible");

        System.out.println("Sending the encrypthed message..");
    }
}
