package com.dmilut.lesson_08.homework.homeworkIryna;

  /* TODO: 8/20/20
        2.1. Реализовать класс Monkey наследованный от Animal
        2.2. Переопределить метод move, так, чтобы он выводил в консоль "Лазанье по деревьям" */


public class Monkey extends com.dmilut.lesson_08.homework.homeworkIrina.Animal {

    public Monkey(String name, int age, String type, String color) {
        super(name, age, type, color);
    }


    @Override
    public void move(String move) {
        super.move(move);
        System.out.println("Climbing the trees");
    }

    /* TODO: 8/20/20
        5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
        5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move */

    Monkey monkey=new Monkey("Dasha", 10, "gorilla", "black");
    public static void main(){
       // System.out.println(name, age, type, color);
    }
    public void monkeyEat(){
        System.out.println("It eats bananas");
    }
    public void monkeySleep(){
        System.out.println("It sleeps like person");
    }
    public void monkeyMove(){
        System.out.println("It jumps funny");
    }
}




