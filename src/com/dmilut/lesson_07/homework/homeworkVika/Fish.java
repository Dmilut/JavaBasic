package com.dmilut.lesson_07.homework.homeworkVika;

/* TODO: 8/17/20
            1.1. Реализовать класс Fish
            1.2. Реализовать поля класса Fish: name, size, color, edible
            1.3. Реализовать методы класса Fish: swim, eat
            1.4. Создать пустой конструктор класса Fish
            1.5. Создать конструктор класса Fish с аргументами в виде полей класса */

public class Fish {

    String name;
    int size;
    String color;
    boolean edible;

    public Fish () {

    }


    public Fish(String name, int size, String color, boolean edible) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.edible = edible;

    }

    public void swim() {
        System.out.println("I can swim");
    }

    public void eat() {
        System.out.println("I want to eat");
    }




}
