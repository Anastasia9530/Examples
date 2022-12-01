package org.petrova.project.task1;

public class AnalyticsData {
    private Integer sum;
    private Integer count;
    private Integer max;
    private Integer min;
    private Integer even;
    private Integer odd;
    private Integer allMultiples;
    private Integer sumeven;
    private Integer sumodd;

    public AnalyticsData(Integer sum, Integer count, Integer max, Integer min, Integer even, Integer odd, Integer allMultiples,  Integer sumeven, Integer sumodd) {
        this.sum = sum;
        this.count = count;
        this.max = max;
        this.min = min;
        this.even = even;
        this.odd = odd;
        this.allMultiples = allMultiples;
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

    public Integer getAllMultiples() {
        return this.allMultiples;
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
                "Произведение введенных чисел: " + allMultiples + "\n" +
                "Сумма четных чисел: " + sumeven + "\n" +
                "Сумма нечетных чисел: " + sumodd + "\n";
    }
}
