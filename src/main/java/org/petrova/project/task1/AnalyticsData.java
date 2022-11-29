package org.petrova.project.task1;

public class AnalyticsData {
    private Integer sum;
    private Integer count;
    private Integer max;
    private Integer min;
    private Integer even;
    private Integer odd;
    private Integer result;
    private Integer sum1;
    private Integer sumeven;
    private Integer sumodd;

    public AnalyticsData(Integer sum, Integer count, Integer max, Integer min, Integer even, Integer odd, Integer result, Integer sum1, Integer sumeven, Integer sumodd) {
        this.sum = sum;
        this.count = count;
        this.max = max;
        this.min = min;
        this.even = even;
        this.odd = odd;
        this.result = result;
        this.sum1 = sum1;
        this.sumeven = sumeven;
        this.sumodd = sumodd;
    }

    public Integer getSum() {
        return this.sum;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getMax() {
        return this.max;
    }

    public Integer getMin() {
        return this.min;
    }

    public Integer getEven() {
        return this.even;
    }

    public Integer getOdd() {
        return this.odd;
    }

    public Integer getResult() {
        return this.result;
    }

    public Integer getSum1() {
        return this.sum1;
    }

    public Integer getSumeven() {
        return this.sumeven;
    }

    public Integer getSumodd() {
        return this.sumodd;
    }

    @Override
    public String toString() {
        return "Аналитика " + "\n" +
                "Выводим сумму: " + sum + "\n" +
                "Выводим количество чисел введенных пользователем: " + count + "\n" +
                "Максимальное число введенное пользователем: " + max + "\n" +
                "Минимальное число введенное пользователем:  " + min + "\n" +
                "Количество четных чисел: " + even + "\n" +
                "Количество нечетных чисел: " + odd + "\n" +
                "Произведение введенных чисел: " + result + "\n" +
                "Сумма четных и нечетных чисел,которые вывел пользователь: " + sum1 + "\n" +
                "Сумма четных чисел: " + sumeven + "\n" +
                "Сумма нечетных чисел: " + sumodd + "\n";
    }
}
