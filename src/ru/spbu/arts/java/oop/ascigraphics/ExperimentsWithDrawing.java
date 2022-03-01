package ru.spbu.arts.java.oop.ascigraphics;

public class ExperimentsWithDrawing {
    public static void main(String args[]){
        Drawing test1 = new Drawing(5,4,'+');
        Drawing test2 = new Drawing(7,5,'*');
        Drawing test3 = new Drawing(8,8,'&');
        Drawing test4 = new Drawing(10,10,'#');

        test1.printTable();
        test1.setPoint(3,3,'$');
        test1.printTable();

        System.out.println();

        test1.drawVerticalLine(2,3,2,'%');
        test1.printTable();

        System.out.println();

        test2.drawHorizontalLine(1,4,3,'@');
        test2.printTable();

        System.out.println();
        test3.drawRectangle(2,2,4,4,'*');
        test3.printTable();

        System.out.println();

        test4.drawCircle(5,5,3,'*');
        test4.printTable();



    }
}
