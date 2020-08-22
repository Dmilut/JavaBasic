package com.dmilut.lesson_08.homework.homeworkVahe;

public class Animal {

    // Easy level
    /* TODO: 8/20/20
        1.1. Реализовать класс Animal
        1.2. Реализовать поля name, age, type, color
        1.3. Реализовать метод move, так, чтобы он выводил в консоль "Какое-то движение"
        1.4. Реализовать методы eat, sleep */

    String name;
    int age;
    String type;
    String color;

    public void move() {
        System.out.println("Какое-то движение");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}
