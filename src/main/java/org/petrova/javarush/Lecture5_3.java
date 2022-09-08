package org.petrova.javarush;

import java.util.Arrays;

public class Lecture5_3 { // методы для работы с массивами
    public static void main(String[] args) {//Получить текстовое представление массива можно с помощью такой конструкции:
        int[] array = {1, 2, 3};
        String str = Arrays.toString(array);//Переменная str будет содержать строковое значение:"[1, 2, 3]"
        a1();
        a2();
    }
    public static void a1(){//В этот метод можно передать двумерный, одномерный, трехмерный и вообще массив любой размерности, и он всегда будет отображать элементы массива.
        int[][] array = { {1, 1}, {2, 2}, {3, 3} };//Переменная str будет содержать строковое значение:"[[1, 1], [2, 2], [3, 3]]"
        String str = Arrays.deepToString(array);
    }
    public static void a2 (){//Метод возвращает true (истина), если массивы равной длины и их элементы равны. Иначе возвращает false (ложь).
        int[] x1 = {1, 2, 3};
        int[] x2 = {1, 2, 3};
        Arrays.equals(x1, x2);//true (содержимое массивов равно)
    }
}
