package com.dmilut.lesson_08.homework.homeworkOlha;

public class Monkey extends Animal {

    /* TODO: 8/20/20
        2.1. Реализовать класс Monkey наследованный от Animal
        2.2. Переопределить метод move, так, чтобы он выводил в консоль "Лазанье по деревьям" */

    @Override
    void move() {
        System.out.println("Climbing trees");
    }
}
