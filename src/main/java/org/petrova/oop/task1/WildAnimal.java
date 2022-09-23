package org.petrova.oop.task1;

public abstract class WildAnimal extends AbstractAnimal {

    public WildAnimal(String breed, Integer weight, Integer age, Integer price) {
        super(breed, weight, age, price);
    }

    public WildAnimal(String breed, Integer weight, Integer age) {
        super(breed, weight, age);
    }

    public Boolean hasOwner() {
        return false;
    }
}