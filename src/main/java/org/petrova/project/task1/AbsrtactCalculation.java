package org.petrova.project.task1;

import java.util.ArrayList;

public abstract class AbsrtactCalculation {

    abstract ArrayList<Integer> getData();


    public void process() {
        ArrayList<Integer> a1 = getData();
    }

    public AnalyticsData calculateAnalytics(ArrayList<Integer> list) {

        int sum = 0; // создаем переменную где храним сумму
        int count = 0; //! храним кол-во чисел
        int max = Integer.MIN_VALUE; // максимально число введенное пользовательем
        int min = Integer.MAX_VALUE; // минимальное число введенное пользователем
        int even = 0;// кол-во четных чисел
        int odd = 0;// кол-во нечетных
        int result = 1;  // храним произведение чисел
        int sum1 = 0; // храним сумму четных и нечетных
        int sumeven = 0; // сумма всех четных
        int sumodd = 0;// сумма всех нечетных


        for (Integer i : list) {

            sum = sum + i;
            count++;
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            if (i % 2 == 0)//чтобы узнать, что число четное, делим на 2. сравниваем.Остаток ноль
                even++;// повторяем виток цикла
            else // если делим на 2 с остатком, то
                odd++; // считаем виток цикла нечетных чисел
            result *= i;//считаем произведение введенных чисел
            sum1 = even + odd;
            sumeven = sumeven + even;
            sumodd = sumodd + odd;
        }

        AnalyticsData a1 = new AnalyticsData(sum, count, max, min, even, odd, result, sum1, sumeven, sumodd);
        return a1;
    }

    public void printAnalytics(AnalyticsData analyticsData) {


        log("Выводим сумму: " + analyticsData.getSum());//выводим сумму чисел
        log("Выводим количество чисел введенных пользователем: " + analyticsData.getCount());
        log("Максимальное число введенное пользователем: " + analyticsData.getMax());
        log("Минимальное число введенное пользователем: " + analyticsData.getMin());
        log("Количество четных чисел: " + analyticsData.getEven());
        log("Количество нечетных чисел: " + analyticsData.getOdd());
        log("Произведение введенных чисел: " + analyticsData.getResult());
        log("Сумма четных и нечетных чисел,которые вывел пользователь: " + analyticsData.getSum1());
        log("Сумма четных чисел: " + analyticsData.getSumeven());
        log("Сумма нечетных чисел: " + analyticsData.getSumodd());
    }

    public static void log(String message) {
        System.out.println(message);
    }
}

