package com.dmilut.lesson_08.homework.reference;

/* TODO: 8/20/20
    2.1. Реализовать класс Monkey наследованный от Animal
    2.2. Переопределить метод move, так, чтобы он выводил в консоль "Лазанье по деревьям" */

public class Monkey extends Animal {

    @Override
    public void move() {
        System.out.println("Лазанье по деревьям");
    }
}
