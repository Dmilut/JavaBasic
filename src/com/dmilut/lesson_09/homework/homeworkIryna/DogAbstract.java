package com.dmilut.lesson_09.homework.homeworkIryna;

/* TODO: 8/24/20
        2.1. Реализовать класс Dog наследованный от Animal
        2.2. Реализовать метод voice */

public class DogAbstract extends AnimalAbstract {
    public DogAbstract() {

    }

    @Override
    public void voice() {
    }

    /* TODO: 8/24/20
        4.1. Добавить в класс Dog поля name, age, weight, type
        4.2. Реализовать геттеры и сеттеры для этих полей */

    public String name;
    public int age;
    public int weight;
    public String type;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

}
