package org.petrova.project.task1;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class AbstractCalculation {

    abstract List<Integer> getData() throws IOException;


    public void process() throws IOException {
        List<Integer> a1 = getData();
        AnalyticsData a2 = calculateAnalytics(a1);

        printAnalytics(a2); //
    }

    public static AnalyticsData calculateAnalytics(List<Integer> list) throws NoSuchElementException {  // считаем аналитику

        if (list.isEmpty())
            throw new NoSuchElementException();

        int count = 0; //! храним кол-во чисел
        int sum = 0; // создаем переменную где храним сумму
        int max = Integer.MIN_VALUE; // максимально число введенное пользовательем
        int min = Integer.MAX_VALUE; // минимальное число введенное пользователем
        int even = 0;// кол-во четных чисел
        int odd = 0;// кол-во нечетных
        int allMultiples = 1;  // храним произведение чисел
        int sumeven = 0; // сумма всех четных
        int sumodd = 0;// сумма всех нечетных

        for (Integer i : list) {

            sum = sum + i;
            count++;
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            if (i % 2 == 0) {  //чтобы узнать, что число четное, делим на 2. сравниваем.Остаток ноль
                even++;
                sumeven += i;
            } else { // считаем сумму нечетных чисел
                odd++;
                sumodd += i;
            }
            allMultiples *= i; //считаем произведение введенных чисел
        }

        return new AnalyticsData(sum, count, max, min, even, odd, allMultiples, sumeven, sumodd);
    }

    abstract public void printAnalytics(AnalyticsData analyticsData) throws IOException;

    public static void log(String message) {
        System.out.println(message);
    }
}


