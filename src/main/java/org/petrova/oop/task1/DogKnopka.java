package org.petrova.oop.task1;

public class DogKnopka extends HomeAnimal {

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
    public Integer getPrice () {return 1000;}
}
