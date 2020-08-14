package com.ChainOfResponsability;

public class DataReaderXml extends DataReader{
    @Override
    public String getExtenssion() {
        return ".xml";
    }

    @Override
    public void doRead(String file) {
        System.out.println("Read a xml file.");
    }
}
