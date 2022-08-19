package org.petrova.yandex;

public class Praktikum4 {

        public static void main(String[] args) {
            int money = 500; // Деньги на корм
            int foodPerDay = 100; // Стоимость пачки корма
            int days = 0; // Дни, когда вы сможете покупать корм
            for (int i = money-foodPerDay; i >= 0 ; i -= foodPerDay,days +=3 ) {
                System.out.println("На " + days+ "-й день останется " + i + " рублей.");
            }
            System.out.println("Денег хватит на " + days+ " дней.");
        }
    }
