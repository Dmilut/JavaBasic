package com.dmilut.lesson_09.homework.homeworkYulia;

public class Cat extends Animal {

    /* TODO: 8/24/20
        3.1. Объявить класс Cat наследованный от Animal
        3.2. Объявить метод voice */

    @Override
    public void voice() {

    }

    /* TODO: 8/24/20
        5.1. Добавить в класс Cat поля name, age, weight, type
        5.2. Реализовать геттеры и сеттеры для этих полей */

    private String name;
    private int age;
    private int weight;
    private String type;

    public Cat(String name, int age, int weight, String type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
