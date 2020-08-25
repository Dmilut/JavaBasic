package com.dmilut.lesson_08.homework.homeworkIrina;

 /* TODO: 8/20/20
        3.1. Реализовать класс Dog наследованный от Animal
        3.2. Переопределить метод move, так, чтобы он выводил в консоль "Бег"
        3.3. Реализовать метод bark */

public class Dog extends Animal {

    public Dog(String name, int age, String type, String color) {
        super(name, age, type, color);
    }

    @Override
    public void move(String move) {
        System.out.println("Running");
    }

    public void bark(String bark) {
        System.out.println("Barking");
    }
    /* TODO: 8/20/20
        6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
        6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark
        6.3. У созданного объекта класса Dog вызвать унаследованный метод move */

    Dog dog = new Dog("Betty", 6, "yorkie", "silver");
    public void dogEat(){
        System.out.println("It eats bone");
    }
    public void dogSleep(){
        System.out.println("It sleeps on the bed");
    }
    public void dogMove(){
        System.out.println("It dances cute");
    }
    public void dogBark(){
        System.out.println("It barks loudly");
    }
    // не понимаю как это сделать  6.3. У созданного объекта класса Dog вызвать унаследованный метод move */
}