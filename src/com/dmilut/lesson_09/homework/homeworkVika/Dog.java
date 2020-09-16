package com.dmilut.lesson_09.homework.homeworkVika;

/* TODO: 8/24/20
        2.1. Реализовать класс Dog наследованный от Animal
        2.2. Реализовать метод voice */

/* TODO: 8/24/20
        4.1. Добавить в класс Dog поля name, age, weight, type
        4.2. Реализовать геттеры и сеттеры для этих полей */

public class Dog extends Animal {

    private String name;
    private int age;
    private int weight;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Gav-Gav");

    }
}
