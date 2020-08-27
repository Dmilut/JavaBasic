package com.dmilut.lesson_08.homework.homeworkIryna;

 /* TODO: 8/20/20
        3.1. Реализовать класс Dog наследованный от Animal
        3.2. Переопределить метод move, так, чтобы он выводил в консоль "Бег"
        3.3. Реализовать метод bark */

public class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Running");
    }


    public void bark() {
        System.out.println("Barking");
    }
}




