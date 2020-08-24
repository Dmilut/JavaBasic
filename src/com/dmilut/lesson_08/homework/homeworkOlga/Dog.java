package com.dmilut.lesson_08.homework.homeworkOlga;

public class Dog extends Animal {

    /* TODO: 8/20/20
        3.1. Реализовать класс Dog наследованный от Animal
        3.2. Переопределить метод move, так, чтобы он выводил в консоль "Бег"
        3.3. Реализовать метод bark */

    /* TODO: 8/20/20
        6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
        6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark
        6.3. У созданного объекта класса Dog вызвать унаследованный метод move */

    public Dog(String name, int age, String type, String color) {
        super(name, age, type, color);
    }

    static Dog dog = new Dog("Boy", 4, "domestic", "white");

    public void main(String[] args) {
        dog.move();
        dog.sleep();
        dog.eat("bone");
        dog.bark();
        super.move();
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Бег");
    }

    public void bark() {
        System.out.println("barking!");
    }

}
