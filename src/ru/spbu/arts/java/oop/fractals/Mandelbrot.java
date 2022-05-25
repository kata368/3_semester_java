package ru.spbu.arts.java.oop.fractals;

import javafx.scene.paint.Color;

public class Mandelbrot implements Fractal {
    public Color paint(double x, double y) {
        int maxIterstions = 5000;
        final int R = 10000000;
        double zx, zy, z=0;
        double cx=x;
        double cy=y;
        Color answer = null;
        for (int step =0; step<maxIterstions; step++) {
            zx = x * x - y * y + cx;
            zy = 2 * x * y + cy;
            z = zx * zx + zy * zy;
            x =zx;
            y=zy;
        }

        if (Math.sqrt(z) < R) {
                answer = Color.BLACK;
            } else {
                answer = Color.WHITE;
            }

        return answer;
    }

}


