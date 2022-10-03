package org.petrova.javarush;

//Чтобы преобразовать объект StringBuilder к строке типа String, нужно просто вызвать у него метод toString().
public class Lecture9_4 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Привет");
        builder.append(123);
        String result = builder.toString();
        System.out.println(result);
        a1();
        a2();
        a3();
    }

    // тобы удалить символ в изменяемой строке, вам нужно воспользоваться методом deleteCharAt() :
    public static void a1() {
        StringBuilder builder = new StringBuilder("Привет");
        builder.deleteCharAt(2);
        String result = builder.toString();
        System.out.println(result);
    }

    //Как заменить часть строки на другую? Для этого есть метод replace(int begin, int end, String str)
    public static void a2() {
        StringBuilder builder = new StringBuilder("Привет");
        builder.replace(2, 5, "Hello!");
        String result = builder.toString();
        System.out.println(result);
    }

    // Как развернуть строку задом наперед?
    //Для этой операции есть специальный метод — reverse()
    public static void a3() {
        String str = "Привет";
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String result = builder.toString();
        System.out.println(result);
    }
}
