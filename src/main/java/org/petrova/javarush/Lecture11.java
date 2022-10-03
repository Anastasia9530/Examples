package org.petrova.javarush;

import java.util.ArrayList;

public class Lecture11 { // Объявление класса внутри класса
    static ArrayList<Point> points = new ArrayList<Point>();

    public static void main(String[] args) {
        Point point = new Point();
        point.x = 100;
        point.y = 200;
        points.add(point);
    }

    static class Point {
        int x;
        int y;
    }
}

