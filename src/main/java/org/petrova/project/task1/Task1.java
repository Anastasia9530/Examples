package org.petrova.project.task1;
//1. Сделать программу по подсчету и аналитике вводимых пользователем числовых данных. В программе нужно постараться задействовать операторы for, while, switch case, goto, return
// 1.1 Ввод числовых данных(целые числа) через консоль, до завершающего спец символа, пустой строки и т.д.
// 1.2 Аналитика выводится в консоль после ввода всех чисел
// 1.3 Данные аналитики: кол-во чисел, максимальное, минимальное, кол-во четных и нечетных, сумма четных и нечетных, общая сумма и произведение всех чисел

public class Task1 {// задача 1

    public static void main(String[] args) {
        AbstractCalculation.log("Введите числа");

        AbstractCalculation a;
        a = new CalculationVariant1();
        a.process();
    }
}


//      Scanner console = new Scanner(System.in);// создали объект сканер
//      ArrayList<Integer> list = new ArrayList<>();

//   while (console.hasNextInt()) //цикл
//        {
//            int x = console.nextInt();// переменная х - выводим в консоль,пользователь вводит числа
//            list.add(x);
//        }
//        calculateAndPrintAnalytics(list);

