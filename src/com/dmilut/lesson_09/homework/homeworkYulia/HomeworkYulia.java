package com.dmilut.lesson_09.homework.homeworkYulia;

public class HomeworkYulia {

    public static void main(String[] args) {

        AnimalManager manager = new AnimalManager();
        manager.sortAndAddCat(new Cat("Baron", 10, 14, "123"));
        manager.sortAndAddCat(new Cat("Tom", 1, 5, "123"));
        manager.sortAndAddDog(new Dog("Bethoven", 10, 70, "1234"));
        manager.sortAndAddDog(new Dog("Puppy", 2, 10, "1234"));

        manager.printAll();

        System.out.println(manager.selectionOfFood("Baron"));
        System.out.println(manager.selectionOfFood("Tom"));
        System.out.println(manager.selectionOfFood("Bethoven"));
        System.out.println(manager.selectionOfFood("Puppy"));
        System.out.println(manager.selectionOfFood("Nobody"));



    }
}