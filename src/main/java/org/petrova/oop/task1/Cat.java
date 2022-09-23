package org.petrova.oop.task1;

public class Cat extends WildAnimal {

    public Cat(String breed, Integer weight, Integer age) {
        super(breed, weight, age);
    }


    @Override
    public Integer getPrice() {
        return 30000;
    }
}
