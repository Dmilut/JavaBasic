package com.dmilut.lesson_08.homework.homeworkOlga;

public class Animal {

                    // Easy level
                     /* TODO: 8/20/20
                    1.1. Реализовать класс Animal
                    1.2. Реализовать поля name, age, type, color
                    1.3. Реализовать метод move, так, чтобы он выводил в консоль "Какое-то движение"
                    1.4. Реализовать методы eat, sleep */

                    /* TODO: 8/20/20
                    4.1. Создать объект класса Animal, инициализировать его поля и вывести их значения в консоль
                    4.2. У созданного объекта класса Animal вызвать методы eat, sleep и move */

    String name;
    int age;
    String type;
    String color;

    public Animal(String name, int age, String type, String color) {
        this.name = name;
        this.age = age;
        this.type=type;
        this.color=color;
                    }
    static Animal cat= new Animal("Molly", 2, "domestic", "grey");

    public void main(String[] args) {
       cat.move();
       cat.sleep();
       cat.eat("milk");

    }
    public void move(){
        System.out.println("Какое-то движение");
    }

    public void eat(String what){
        System.out.println(getClass()+ "eating"+ what);
    }

    public void sleep(){
        System.out.println(getClass() + "sleeping!");
    }

}
