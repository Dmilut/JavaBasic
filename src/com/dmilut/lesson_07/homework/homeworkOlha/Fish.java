package com.dmilut.lesson_07.homework.homeworkOlha;

        //  Easy level
        /* TODO: 8/17/20
            1.1. Реализовать класс Fish
            1.2. Реализовать поля класса Fish: name, size, color, edible
            1.3. Реализовать методы класса Fish: swim, eat
            1.4. Создать пустой конструктор класса Fish
            1.5. Создать конструктор класса Fish с аргументами в виде полей класса */

//1.1 class
public class Fish {

    //1.2 fields
    String name;
    float size;
    String color;
    Boolean edible;

    //1.4 constructor
    Fish() {

    }

    //1.5 constructor
    Fish(String name, float size, String color, boolean edible) {
        //1.5 arguments
        this.name = name;
        this.size = size;
        this.color = color;
        this.edible = edible;
    }

    public float getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public boolean getEdible() {
        return edible;
    }

    //1.3 method
    void swim() {
        System.out.println("Let's swim!");
    }

    void eat() {
        System.out.println("I'm hungry");
    }

}

