package com.ChainOfResponsability;

public abstract class DataReader {
    private DataReader next;

    public void setNext(DataReader next){ this.next = next; }

    public void read(String fileName){
       if(fileName.endsWith(getExtenssion())){
           this.doRead(fileName);
           return;
       }

       if(next != null)
           next.read(fileName);
       else
           throw new UnsupportedOperationException("File format not supported.");
    }

    public abstract String getExtenssion();
    public abstract void doRead(String file);
}
