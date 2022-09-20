package org.petrova.javarush;
//вы хотите, допустим, написать программу,
// которая имитирует выбрасывание кубика с шестью гранями.
// Как получить случайные целые числа в диапазоне 1..6
public class Lecture8_1 {
    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 6)+1; // умножаем результат функции Math.random на 6
    }
//Функция getRandomDiceNumber() возвращает случайное целое число из диапазона 0..5 включительн
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int x = getRandomDiceNumber();
            System.out.println(x);
        }
    }
}
