package com.dmilut.lesson_08.homework.homeworkRam;

import java.sql.SQLOutput;

public class HomeworkRam {

    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.move();


        Monkey bigmonkey = new Monkey();
        bigmonkey.name = "King Kong";
        bigmonkey.age = 14;
        bigmonkey.color = "Black";
        bigmonkey.type = "Gorila";


        System.out.println (bigmonkey.name + bigmonkey.age + bigmonkey.color + bigmonkey.name);


      /*  System.out.println(bigmonkey.move());
        System.out.println(bigmonkey.eat());
        System.out.println(bigmonkey.sleep());
*/

        Dog smalldog = new Dog();
        smalldog.name = "Tuzik";
        smalldog.age = 3;
        smalldog.color = "Brown";
        smalldog.type = "Doberman";

        System.out.println (smalldog.name + smalldog.age + smalldog.color + smalldog.name);


       /* System.out.println(smalldog.move());
        System.out.println(smalldog.eat());
        System.out.println(smalldog.sleep());

*/





    }
}





