package ru.spbu.arts.java.oop.interfaces;

public class PrintableLetter implements Printable {
    String letter;
    int number;

    PrintableLetter(String letter, int repetition){
        this.letter=letter;
        this.number=repetition;
    }


    public void print(){
        for (int i = 1; i<=number; i++){
            System.out.print(letter);
        }
        System.out.println();
    }
}
