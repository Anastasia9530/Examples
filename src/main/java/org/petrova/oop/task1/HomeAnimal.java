package org.petrova.oop.task1;

public abstract class HomeAnimal extends AbstractAnimal {
    public HomeAnimal(String breed, Integer weight, Integer age, Integer price) {
        super(breed, weight, age, price);
    }

    public HomeAnimal(String breed, Integer weight, Integer age) {
        super(breed, weight, age);
    }

    public Boolean hasOwner() {
        return true;
    }

}
