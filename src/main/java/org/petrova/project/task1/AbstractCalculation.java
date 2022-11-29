package org.petrova.project.task1;

import java.io.IOException;
import java.util.List;

public abstract class AbstractCalculation {

    abstract List<Integer> getData() throws IOException;


    public void process() throws IOException {
        List<Integer> a1 = getData();
        AnalyticsData a2 = calculateAnalytics(a1);

        printAnalytics(a2); //
    }

    public AnalyticsData calculateAnalytics(List<Integer> list) {  // считаем аналитику

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

    abstract public void printAnalytics(AnalyticsData analyticsData) throws IOException;

    public static void log(String message) {
        System.out.println(message);
    }
}

