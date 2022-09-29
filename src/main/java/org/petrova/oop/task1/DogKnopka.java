package org.petrova.oop.task1;

public class DogKnopka extends HomeAnimal {

    public DogKnopka(String breed, Integer weight, Integer age, Integer price) {
        super(breed, weight, age, price);
    }

    public DogKnopka(String breed, Integer weight, Integer age) {
        super(breed, weight, age);
    }

    public DogKnopka() {
        super("Джек-Рассел", 9, 2, 1000, "Кнопка");
        setAge(15);
    }

}
