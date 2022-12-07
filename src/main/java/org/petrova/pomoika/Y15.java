package org.petrova.pomoika;

import org.petrova.common.Utils;

public class Y15 {
    public static void main(String[] args) {

        a1();
        a2();
        a3();
        a4();
        a5();


        var v1 = 1; // 0b00001 = 1
        v1 = v1 * 2; // 0b00010 = 2
        v1 = v1 * 2; // 0b00100 = 4
        v1 = v1 * 2; // 0b01000 = 8
        v1 = v1 * 2; // 0b10000 = 16

        var v2 = 0b0011010; //
        v2 = v2 << 1; //  0b00110100
        v2 = v2 >> 3; //  0b00000110

        Utils.log("v1: " + v1 + ", v2: " + v2);
    }

    public static void a1() {

        int x = 342;

        //побитовый оператор "НЕ" ~

        System.out.println(" " + x + ": " + Integer.toBinaryString(x));
        System.out.println(" " + ~x + ": " + Integer.toBinaryString(~x));
    }

    public static void a2() {

        // Побитовый оператор "И" & сравнивает первый бит верхнего числа с первым битом нижнего.
        // Результат будет равен 1 только в том случае, если оба бита равны 1. Во всех остальных случаях результатом будет 0.

        System.out.println(277 & 432);
    }

    public static void a3() {

        // Побитовый оператор "ИЛИ" |. Принцип работы тот же — сравниваем два числа по битам.
        // Только теперь если хотя бы один из битов равен 1, результат будет равен 1

        System.out.println(277 | 432);
    }

    public static void a4() {

        int x = 342;
        System.out.println(Integer.toBinaryString(x));
    }

    public static void a5() {

        /*
        1=0001
        2=0010
        3=0011
        4=0100
        5=0101
        6=0110
        7=0111
        8=1000

                     --- BIN AND ---
                     1 И 3 => 001 & 011 => 001
                 И    011101011
                      110011111 :И =>
                      010001011

                      --- BIN OR ---
                      010101011
                      110011111 :OR =>
                      110111111
                      1 | 3 => 001 | 011 => 011

                      -- LOGIC AND ---
                      != 0 =>  TRUE
                      == 0 => FALSE

                      true && true => true

                      -- LOGIC OR ---
                      true || false => true


         */

        int a = 0b01;  // 1
        int b = 0b11;  // 3
        int resultAnd = a & b; // 1


        Utils.log("AND");
        var v1 = getInt(2) & getInt(1);  // 0b001 & 0b010 => 0b0
        var v2 = getBool(2) && getBool(1); //
        var v3 = getBool(1) && getBool(2); //

        Utils.log("v1: " + v1);
        Utils.log("v2: " + v2);
        Utils.log("v3: " + v3);


        Utils.log("OR");
        var v4 = getInt(2) | getInt(1);  // 0b001 | 0b010 => 0b11
        var v5 = getBool(1) || getBool(1); // true
        var v6 = getBool(1) || getBool(2); // true

        Utils.log("v4: " + v4);
        Utils.log("v5: " + v5);
        Utils.log("v6: " + v6);
    }

    public static int getInt(int i) {
        Utils.log("getInt: " + i);
        return i;
    }

    public static boolean getBool(int i) {
        Utils.log("getBool: " + i);
        return i != 0;
    }
}



