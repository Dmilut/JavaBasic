package com.dmilut.lesson_09.homework.homeworkVahe;

/* TODO: 8/24/20
    3.1. Объявить класс Cat наследованный от Animal
    3.2. Объявить метод voice */
public class Cat extends Animal {

    private String name;
    private int age;
    private int weight;
    private String type;

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    /* TODO: 8/24/20
        5.1. Добавить в класс Cat поля name, age, weight, type
        5.2. Реализовать геттеры и сеттеры для этих полей */

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









