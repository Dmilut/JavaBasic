package com.dmilut.lesson_08.homework.homeworkOlha;

public class Dog extends Animal{

    /* TODO: 8/20/20
        3.1. Реализовать класс Dog наследованный от Animal
        3.2. Переопределить метод move, так, чтобы он выводил в консоль "Бег"
        3.3. Реализовать метод bark */

    @Override
    void move() {
        System.out.println("Run");
    }

    void bark() {
        System.out.println("Woof-woof!");
    }
    
}
