package com.dmilut.lesson_08.homework.homeworkIrina;

public class Animal {

    // Easy level
    /* TODO: 8/20/20
        1.1. Реализовать класс Animal
        1.2. Реализовать поля name, age, type, color
        1.3. Реализовать метод move, так, чтобы он выводил в консоль "Какое-то движение"
        1.4. Реализовать методы eat, sleep */


    public String name;
    public int age;
    public String type;
    public String color;


    public void move(String move) {
        System.out.println("Some movement");
    }

    public void eat() {
        System.out.println("It likes to eat");
    }
    public void sleep() {
        System.out.println("It likes to sleep");
    }

    /* TODO: 8/20/20
      4.1. Создать объект класса Animal, инициализировать его поля и вывести их значения в консоль
      4.2. У созданного объекта класса Animal вызвать методы eat, sleep и move */
    public Animal(String name, int age, String type, String color) {
        Animal tiger = new Animal("Max ", 3, " striped ", " orange ");
        System.out.println(name+age+type+color);
    }
    public void tigerEat(){
        System.out.println("It eats meat");
    }
    public void tigerSleep(){
        System.out.println("It sleeps in the cave");
    }
    public void tigerMove(){
        System.out.println("It moves fast");
    }
    }






