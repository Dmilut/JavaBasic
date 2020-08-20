package com.dmilut.lesson_07.lesson;

public class Lesson {

    public static void main(String[] args) {

        Human vasia = new Human();
        vasia.sex = 'f';

        Human petia = new Human('m', 40);

        //System.out.println(vasia.sex);

        boolean a = vasia.isPlaying("Blue");

        System.out.println(petia.sex);
        System.out.println(petia.age);


    }
}
