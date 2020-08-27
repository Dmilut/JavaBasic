package com.dmilut.lesson_10.lesson;

public class Bug extends Insect implements Flyable, Movable{

    @Override
    public void eat() {
        System.out.println("Bug eat");
    }

    @Override
    public void fly() {
        System.out.println("Bug fly");
    }

    @Override
    public void move() {
        System.out.println("Bug move");
    }


}
