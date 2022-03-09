package ru.spbu.arts.java.oop.ascigraphics;
import java.util.Arrays;
public class Drawing {
    int row;
    int column;
    char method;
    char [][] t= new char[row][column];

    Drawing(int row, int column, char method){
        this.row=row;
        this.column=column;
        this.method=method;
        char [][] table= new char[row][column];
        this.t= table;
        for(char[] i: table) {
            Arrays.fill(i, method);
        }

    }

    public void printTable(){
        String lines = "";
        for (char[] line : t){
            for (char x: line){
                lines= lines + x +" ";
            }
            System.out.println(lines);
            lines= "";
        }
    }

    public char [][] setPoint(int x, int y, char symbol){
        t[y][x]=symbol;
        return t;
    }

    public char [][] drawVerticalLine(int rowStart, int rowEnd, int forColumn, char symbol){
        for (int i=rowStart; i<=rowEnd; i++){
            t[i][forColumn]=symbol;
        }
        return t;
    }

    public char [][] drawHorizontalLine(int columnStart, int columnEnd, int forRow, char symbol){
        for (int i=columnStart; i<=columnEnd; i++){
            t[i][forRow]=symbol;
        }
        return t;
    }

    public char [][] drawRectangle(int firstAngleX, int firstAngleY, int secondAngleX, int secondAngleY, char symbol){
        for (int i=firstAngleX; i<=secondAngleX; i++){
            t[firstAngleY][i]=symbol;
            t[i][firstAngleY]=symbol;
        }
        for (int i =firstAngleY; i<=secondAngleY; i++){
            t[secondAngleX][i]=symbol;
            t[i][secondAngleY]=symbol;
        }
        return t;
    }

    public char[][] drawCircle(int centerX, int centerY, int radius, char symbol){
        for (int i=0; i<t.length-1; i++){
            for (int a=0; a <(t[a].length-1); a++){
                if (Math.sqrt((a-centerY)*(a-centerY) + (i-centerX)*(i-centerX))<= radius) {
                    t[i][a]=symbol;
                }
            }
        }
        return t;
    }
}