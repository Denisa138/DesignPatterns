package com.ChainOfResponsability;

public class DataReaderNumbers extends DataReader{
    @Override
    public String getExtenssion() {
        return ".numbers";
    }

    @Override
    public void doRead(String file) {
        System.out.println("Read a numbers file.");
    }
}
