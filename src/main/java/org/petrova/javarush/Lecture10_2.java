package org.petrova.javarush;

public class Lecture10_2 {
    public class Main
    {
        public static void main(String[] args)
        {
//            ChildClass obj = new ChildClass(); // Создаем объект типа ChildClass
        }

        public static String print(String text) // Этот метод пишет в консоль переданный текст и возвращает его же
        {
            System.out.println(text);
            return text;
        }
    }

    class ParentClass //Объявляем ParentClass
    {
        public String a = Main.print("ParentClass.a"); //Пишем текст и им же инициализируем переменные
        public String b = Main.print("ParentClass.b");
        public ParentClass()
        {
            Main.print("ParentClass.constructor"); //Пишем в консоль сообщение о вызове конструктора. Возвращаемое значение игнорируем.
        }
    }

//    static class ChildClass extends ParentClass //Объявляем ChildClass, который расширяет класс родители
//    {
//        public String c = Main.print("ChildClass.c");//Пишем текст и им же инициализируем переменные
//        public String d = Main.print("ChildClass.d");
//
//        public ChildClass()
//        {
//            Main.print("ChildClass.constructor");//Пишем в консоль сообщение о вызове конструктора. Возвращаемое значение игнорируем.
//        }
//    }
}
