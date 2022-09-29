package org.petrova.oop.task2;

import java.util.Objects;

public abstract class Human {
    private String name;
    private Integer age;
    private String pol;
    private Integer weight;
    private Integer height;

    public Human(String name, Integer age, String pol, Integer weight, Integer height) {
        this.name = name;
        this.age = age;
        this.pol = pol;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && age.equals(human.age) && Objects.equals(weight, human.weight) && Objects.equals(height, human.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


}
