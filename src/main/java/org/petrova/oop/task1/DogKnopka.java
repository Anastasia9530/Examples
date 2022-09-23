package org.petrova.oop.task1;

public class DogKnopka extends HomeAnimal {

    public DogKnopka(String breed, Integer weight, Integer age, Integer price) {
        super(breed, weight, age, price);
    }

    public DogKnopka(String breed, Integer weight, Integer age) {
        super(breed, weight, age);
    }

    public DogKnopka() {
        super(null, null, null);
    }

    @Override
    public String getBreed() {
        return "Джек-Рассел";
    }

    @Override
    public Integer getWeight() {
        return 9;
    }

    @Override
    public Integer getAge() {
        return 2;
    }

    @Override
    public Integer getPrice() {
        return 1000;
    }
}
