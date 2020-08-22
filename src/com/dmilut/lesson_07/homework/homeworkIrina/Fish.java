package com.dmilut.lesson_07.homework.homeworkIrina;

//  Easy level
        /* TODO: 8/17/20
            1.1. Реализовать класс Fish
            1.2. Реализовать поля класса Fish: name, size, color, edible
            1.3. Реализовать методы класса Fish: swim, eat
            1.4. Создать пустой конструктор класса Fish
            1.5. Создать конструктор класса Fish с аргументами в виде полей класса */


public class Fish {
    public String name;
    public int size;
    public int age;
    public String color;
    public boolean edible;

    public boolean swim(String swimming) {
        if (swimming.equals("can swim")) {
            return true;
        } else return false;
    }

    public boolean eat(String eating) {
        if (eating.equals("can eat")) {
            return true;
        } else return false;
    }

    public void fly(String flying) {
        if (flying.equals("can fly")) {
            System.out.println("false");
        }
    }

    public Fish() {
    }

    public Fish(String name, String color, int age, int size, boolean edible) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.size = size;
        this.edible = true;
    }

    /* TODO: 8/17/20
        2.1. Создать экземпляр класса Fish используя пустой конструктор
        2.2. Создать экземпляр класса Fish используя конструктор для инициализации полей */
    Fish myFish = new Fish();

    Fish Whale = new Fish("whale", "black", 10, 1000, false);

}