package org.petrova.javarush;

public class Lecture9 {
    public static void main(String[] args) {

        String s = "Фильм \"Друзья\" номинирован на \"Оскар\"";//  Экранирование символов
        System.out.println(s);


        // Перенос строки внутри кавычек:
        System.out.println("С уважением,\nАноним");


        // Табуляция \t
        System.out.println("0\t1\t2\t3");
        System.out.println("0\t10\t20\t30");
        System.out.println("0\t100\t200\t300");

        // Возврат на один символ назад \b
        System.out.println("Привет\b\b Мир");

        // Возврат каретки \r
        System.out.println("Привет\rМир!");

        //Юникод
        System.out.println("\uD83D\uDD0A"); // поч не выводится иконка звука?
    }
}
