package ru.spbu.arts.java.oop.ascigraphics;

import ru.spbu.arts.java.oop.interfaces.Printable;

import java.util.Arrays;
public class Drawing implements Printable {
    int row;
    int column;
    char method;
    char [][] t;

    public Drawing(int row, int column, char method){
        this.row=row;
        this.column=column;
        this.method=method;
        char [][] table= new char[row][column];
        this.t= table;
        for(char[] i: table) {
            Arrays.fill(i, method);
        }

    }

    public void print(){
        for (char[] line : t){
            String lines = "";
            for (char x: line){
                lines= lines + x +" ";
            }
            System.out.println(lines);
        }
    }

    public void setPoint(int x, int y, char symbol){
        t[y][x]=symbol;
    }

    public void drawVerticalLine(int rowStart, int rowEnd, int forColumn, char symbol){
        for (int i=rowStart; i<=rowEnd; i++){
            t[i][forColumn]=symbol;
        }
    }

    public void drawHorizontalLine(int columnStart, int columnEnd, int forRow, char symbol){
        for (int i=columnStart; i<=columnEnd; i++){
            t[i][forRow]=symbol;
        }

    }

    public void drawRectangle(int firstAngleX, int firstAngleY, int secondAngleX, int secondAngleY, char symbol){
        for (int i=firstAngleX; i<=secondAngleX; i++){
            t[firstAngleY][i]=symbol;
            t[i][firstAngleY]=symbol;
        }
        for (int i =firstAngleY; i<=secondAngleY; i++){
            t[secondAngleX][i]=symbol;
            t[i][secondAngleY]=symbol;
        }

    }

    public void drawCircle(int centerX, int centerY, int radius, char symbol){
        for (int i=0; i<t.length-1; i++){
            for (int a=0; a <(t[a].length-1); a++){
                if (Math.sqrt((a-centerY)*(a-centerY) + (i-centerX)*(i-centerX))<= radius) {
                    t[i][a]=symbol;
                }
            }
        }
    }
}
