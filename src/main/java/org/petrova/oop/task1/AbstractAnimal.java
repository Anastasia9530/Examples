package org.petrova.oop.task1;

public abstract class AbstractAnimal implements Animal {

    private String breed;
    private Integer weight;
    private Integer age;
    private Integer price;

    public AbstractAnimal(String breed, Integer weight, Integer age, Integer price) {
        this.breed = breed;
        this.weight = weight;
        this.age = age;
        this.price = price;
    }

    public AbstractAnimal(String breed, Integer weight, Integer age) {
        this.breed = breed;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public Integer getWeight() {
        return this.weight;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }
    // public AbstractAnimal() {
    //}
}
