package org.petrova.project.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculationVariant1 extends AbstractCalculation {
    public CalculationVariant1() {
    }

    @Override
    ArrayList<Integer> getData() {
        Scanner console = new Scanner(System.in);// создали объект сканер
        ArrayList<Integer> list = new ArrayList<>();

        int x = 0;
        while (console.hasNextInt()) //цикл
        {
           x = console.nextInt();
            list.add(x);
        }
        return list;
    }
}
