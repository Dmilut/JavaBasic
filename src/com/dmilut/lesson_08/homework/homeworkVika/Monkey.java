package com.dmilut.lesson_08.homework.homeworkVika;

public class Monkey extends Animal {


    public Monkey(String name, String color, int age, String type) {
        super(name,color,age,type);

    }

    @Override
    public void move() {
        System.out.println("Лазанье по деревьям");

    }
}
