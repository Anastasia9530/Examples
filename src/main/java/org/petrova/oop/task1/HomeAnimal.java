package org.petrova.oop.task1;

public abstract class HomeAnimal extends AbstractAnimal {

    private String name;

    public HomeAnimal(String breed, Integer weight, Integer age, Integer price) {
        super(breed, weight, age, price);
    }

    public HomeAnimal(String breed, Integer weight, Integer age) {
        super(breed, weight, age);
    }

    public HomeAnimal(String breed, Integer weight, Integer age, Integer price, String name1) {
        super(breed, weight, age, price);
        this.name = name1;
    }

    public Boolean hasOwner() {
        return true;
    }

    public String getName() {
        return name;
    }


}
