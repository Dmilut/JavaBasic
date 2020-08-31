package com.dmilut.lesson_09.homework.homeworkOlga;

/* TODO: 8/24/20
    3.1. Реализовать класс Cat наследованный от Animal
    3.2. Реализовать метод voice */
public class Cat extends Mammal {

    /* TODO: 8/24/20
        5.1. Добавить в класс Cat поля name, age, weight, type
        5.2. Реализовать геттеры и сеттеры для этих полей */

    public int weight;
    public String type;

    public Cat(String name, int age, int weight, String type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;

    }

    @Override
    public void voice() {
        System.out.println("meow");
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
