package com.dmilut.lesson_08.homework.homeworkRam;

public class Dog extends Animal {

    {
        System.out.println("Task 3");
    }

    @Override
    public void move() {

        super.move();

        System.out.println("run");
    }


    public void bark() {
        System.out.println("wof");
    }
}
