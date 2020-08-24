package com.dmilut.lesson_08.homework.homeworkYulia;

public class Dog extends Animal{

       /* TODO: 8/20/20
        3.1. Реализовать класс Dog наследованный от Animal
        3.2. Переопределить метод move, так, чтобы он выводил в консоль "Бег"
        3.3. Реализовать метод bark */

    public Dog(String name, int age, String type, String color) {
        super(name, age, type, color);
    }

    @Override
    public void move() {
        System.out.println("Dog is running");
    }

    public void bark() {

    }

}
