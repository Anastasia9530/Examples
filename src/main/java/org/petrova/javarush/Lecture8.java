package org.petrova.javarush;

public class Lecture8 {
    public static int a = 41;
    public static int c = 11119;
    public static int m = 11113;
    public static int seed = 1;

    public static int getNextRandom() // данная программа выведет на экран 10 неповторяющихся чисел
    {
        seed = (a * seed + c) % m; // seed это? как расшифровать код?или эта формула универсальная для рандома
        return seed;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(getNextRandom());
        }
    }
}
