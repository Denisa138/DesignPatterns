package com.ChainOfResponsability;

public class Demo {

    public static void show() {
        DataReader factory = new DataReaderFactory().demo();
        factory.read("data.xml");
        factory.read("data.numbers");
    }
}
