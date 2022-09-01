package org.petrova.javarush;

public class Lecture3_1 {
    public static void main(String[] args) {
        int temperature = 9;

        if (temperature > 20)
            System.out.println("надеть рубашку");
        else // тут температура меньше (или равна) 20
        {
            if (temperature > 10)
                System.out.println("надеть свитер");
            else // тут температура меньше (или равна) 10
            {
                if (temperature > 0)
                    System.out.println("надеть плащ");
                else // тут температура меньше 0
                    System.out.println("надеть пальто");
                a1();
                a2();
            }
        }
    }

    public static void a1() {
        int temperature = 9;
        if (temperature > 20)
            System.out.println("надеть рубашку");
        else // тут температура меньше (или равна) 20
            if (temperature > 10)
                System.out.println("надеть свитер");
            else // тут температура меньше (или равна) 10
                if (temperature > 0)
                    System.out.println("надеть плащ");
                else // тут температура меньше 0
                    System.out.println("надеть пальто");
    }

    public static void a2() {// обычно программисты пишут так???
        int temperature = 9;
        if (temperature > 20)
            System.out.println("надеть рубашку");
        else if (temperature > 10) // тут температура меньше (или равна) 20
            System.out.println("надеть свитер");
        else if (temperature > 0) // тут температура меньше (или равна) 10
            System.out.println("надеть плащ");
        else // тут температура меньше 0
            System.out.println("надеть пальто");
    }
}

