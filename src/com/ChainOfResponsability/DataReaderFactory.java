package com.ChainOfResponsability;

public class DataReaderFactory {

    public static DataReader demo() {
        DataReader xmlFile = new DataReaderXml();
        DataReader numbersFile = new DataReaderNumbers();

        xmlFile.setNext(numbersFile);
        numbersFile.setNext(null);

        return xmlFile;
    }
}
