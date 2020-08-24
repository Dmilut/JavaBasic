package com.dmilut.lesson_08.homework.homeworkOlga;

public class Monkey extends Animal{

/*
 TODO: 8/20/20
                2.1. Реализовать класс Monkey наследованный от Animal
                2.2. Переопределить метод move, так, чтобы он выводил в консоль "Лазанье по деревьям"


 TODO: 8/20/20
                 5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
                 5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move

*/

    public Monkey(String name, int age, String type, String color) {
                    super(name, age, type, color);
                }
    static Monkey monkey= new Monkey("Lily", 5, "wild", "brown");

    public static void main(String[] args) {
        monkey.move();
        monkey.sleep();
        monkey.eat("banana");

    }
    @Override
    public void move() {
        super.move();
        System.out.println("Лазанье по деревьям");
    }
}
