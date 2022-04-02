package ru.spbu.arts.java.oop.interfaces;

public class PrintableString implements Printable{
    String forPrinting;

    PrintableString(String toConstructor){
        this.forPrinting=toConstructor;
    }

    @Override
    public void print(){
        System.out.println(forPrinting);
    }
}
