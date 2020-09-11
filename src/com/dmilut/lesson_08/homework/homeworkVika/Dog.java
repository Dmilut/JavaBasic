package com.dmilut.lesson_08.homework.homeworkVika;

public class Dog extends Animal {

    public Dog(String name, String color, int age, String type) {

        super(name,color,age,type);

    }


    @Override
    public void move() {
        System.out.println("Бег");
    }

    public void bark() {
        System.out.println("Гав");
    }
}
