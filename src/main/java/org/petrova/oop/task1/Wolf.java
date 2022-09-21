package org.petrova.oop.task1;

public class Wolf extends WildAnimal {

    private String breed;
    private Integer weight;
    private Integer age;
    private Integer price;

    public Wolf(String breed, Integer weight, Integer age, Integer price) {
        this.breed = breed;
        this.weight = weight;
        this.age = age;
        this.price = price;
    }

    @Override
    public String getBreed() {
        return this.breed;
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
    public Integer getPrice () {return this.price;}
}


