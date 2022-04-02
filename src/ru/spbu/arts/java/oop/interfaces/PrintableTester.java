package ru.spbu.arts.java.oop.interfaces;
import ru.spbu.arts.java.oop.ascigraphics.Drawing;


public class PrintableTester {


    public static void main(String[] args) {

        Drawing dr= new Drawing(10,10,'*');
        dr.print();

        PrintableLetter pl = new PrintableLetter("x", 10);
        pl.print(); //печатает букву x 10 раз

        PrintableString ps = new PrintableString("asdf");
        ps.print(); //печатает asdf

        Printable okay = new Printable() {
            @Override
            public void print() {
                System.out.println("I'm in array!");
            }
        };



        Printable please;
        please = () -> System.out.println("Please work!");

        Printable[] duck = new Printable[5];
        duck[0]= dr;
        duck[1] = pl;
        duck[2]= ps;
        duck[3]=okay;
        duck[4]= please;

        for (Printable x: duck){
            x.print();
        }

    }


}
