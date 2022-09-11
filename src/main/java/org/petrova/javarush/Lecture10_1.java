package org.petrova.javarush;

public class Lecture10_1 {
    public static class Point
    {
        public int x;
        public int y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    public class Solution
    {
    }

    public static void main(String[] args) {
        Point point = new Point(5, 10);
    }
}
