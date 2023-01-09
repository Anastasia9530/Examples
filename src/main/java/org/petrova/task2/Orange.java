package org.petrova.task2;

import org.petrova.common.Utils;

public class Orange implements Fruit {

    public static void main(String[] args) {

        Fruit orange1 = new Orange();
        Fruit orange2 = (weight -> {
            System.out.println("weight2 :" + weight);
        });
        orange2.weight(3);
        orange1.weight(1);
    }

    @Override
    public void weight(int n) {
        Utils.log("weight: " + n);
    }
}