package com.dmilut.lesson_08.homework.homeworkRam;

public class Dog extends Animal {

    /* TODO: 8/20/20
        3.1. Реализовать класс Dog наследованный от Animal
        3.2. Переопределить метод move, так, чтобы он выводил в консоль "Бег"
        3.3. Реализовать метод bark */

    {
        System.out.println("Task 3");
    }

    @Override
    public void move() {

        super.move();

        System.out.println("run");
    }


    public void bark() {
        System.out.println("wof");
    }
}
