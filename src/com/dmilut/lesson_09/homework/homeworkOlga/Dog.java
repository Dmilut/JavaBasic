package com.dmilut.lesson_09.homework.homeworkOlga;

/* TODO: 8/24/20
    2.1. Реализовать класс Dog наследованный от Animal
    2.2. Реализовать метод voice */
public class Dog extends Mammal {

    /* TODO: 8/24/20
        4.1. Добавить в класс Dog поля name, age, weight, type
        4.2. Реализовать геттеры и сеттеры для этих полей */

    public int weight;
    public String type;

    @Override
    public void voice() {
        System.out.println("bark");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

