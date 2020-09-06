package com.dmilut.lesson_08.homework.homeworkVika;

public class Animal {

    String name;
    String color;
    int age;
    String type;

    public Animal(String name, String color, int age, String type) {
        this.name = name;
        this.color = color;
        this. age = age;
        this.type = type;

    }

    public void move() {
        System.out.println("Moving");
    }

    public void eat () {
        System.out.println("eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}
