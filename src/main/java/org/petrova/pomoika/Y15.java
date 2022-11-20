package org.petrova.pomoika;

public class Y15 {
    public static void main(String[] args) {

        int x = 342;
        System.out.println(Integer.toBinaryString(x));

        a1();
        a2();
        a3();

    }

    public static void a1() {

        int x = 342;

        //побитовый оператор "НЕ" ~

        System.out.println(Integer.toBinaryString(~x));
    }

    public static void a2() {

        //побитовый оператор "И" & сравнивает первый бит верхнего числа с первым битом нижнего.
        // Результат будет равен 1 только в том случае, если оба бита равны 1. Во всех остальных случаях результатом будет 0.

        System.out.println(277 & 432);
    }

    public static void a3() {

        // побиовый оператор "ИЛИ" |. Принцип работы тот же — сравниваем два числа по битам.
        // Только теперь если хотя бы один из битов равен 1, результат будет равен 1

        System.out.println(277 | 432);
    }
}


