package org.petrova.pomoika;
//1.Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
// 2.Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
// 3.Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
//  4.Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class Y2 {
    public static void main(String[] args) {
        for (int n = 1000; n <= 9999; n = n + 3) // начинаем с 1000, цикл выполняем +3 до 9999
            System.out.print(n + " ");
        System.out.println(" ");
        a1();
        System.out.println(" ");
        a2();
        System.out.println(" ");
        a3();
        System.out.println(" ");
        a4();
        System.out.println(" ");
        a5();
    }

    public static void a1() {
        for (int w = 1; w <= 55; w = w + 2)
            System.out.print(w + " ");
    }

    public static void a2() {
        for (int p = 90; p >= 0; p = p - 5) { // как поставить пробел перед выводом цикла?????
            System.out.print(p + " ");
        }
    }

    public static void a3() {
        for (int a = 1, b = 2; a <= 20; a++, b = b * 2) // сделала с подсказкой
            System.out.print(b + " ");
    }

    public static void a4() { // задача 1 с циклом while
        int a = 1000;
        while (a <= 9999) {
            System.out.print(a + " ");
            a = a + 3;
        }
    }

    public static void a5() { // задача 3 с циклом while
        int a = 90;
        while (a >= 0) {
            System.out.print(a + " ");
            a = a - 5;
        }
    }
}