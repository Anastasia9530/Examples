package org.petrova.javarush;
//в вашей программе нужно хранить координаты 100 точек и метод :
public class Lecture7_1 {
    public static void printPoints(int[] x, int[] y, int[] color) {
        for (int i = 0; i < x.length; i++)
            System.out.println("Цвет точки x=" + x[i] + ", y=" + y[i] + " " + color[i]);
    }

    public static void main(String[] args) {
        int[] x = new int[100];
        int[] y = new int[100];
        int[] color = new int[100];
        printPoints(x, y, color);
    }
}
