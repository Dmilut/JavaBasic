package com.dmilut.lesson_08.homework.homeworkYulia;
  /* TODO: 8/20/20
        1.1. Реализовать класс Animal
        1.2. Реализовать поля name, age, type, color
        1.3. Реализовать метод move, так, чтобы он выводил в консоль "Какое-то движение"
        1.4. Реализовать методы eat, sleep */

public class Animal {
    String name;
    int age;
    String type;
    String color;

    public Animal( String name, int age, String type, String color) {
        this.name=name;
        this.age = age;
        this.type = type;
        this.color = color;
    }

    public void move() {
        System.out.println("Animal randomly moving");
    }

    public void eat() {

    }

    public void sleep() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
