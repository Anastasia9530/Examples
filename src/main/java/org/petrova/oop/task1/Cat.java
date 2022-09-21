package org.petrova.oop.task1;

public class Cat extends WildAnimal {

    private String breed;
    private Integer weight;
    private Integer age;
    private Integer price;

    public Cat(String breed, Integer weight, Integer age) {
        this.breed = breed;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String getBreed() {
        return (this.breed);
    }

    @Override
    public Integer getWeight() {
        return (this.weight);
    }

    @Override
    public Integer getAge() {
        return (this.age);
    }

    @Override
    public Integer getPrice() {
        return 30000;
    }
}
