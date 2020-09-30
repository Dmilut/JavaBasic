package com.dmilut.lesson_18.homework.homeworkIryna;

public class HomeworkIryna {

    public static void main(String[] args) {
        /* TODO: 9/24/20
            1.1. Реализовать собственный вариант ассоциативного массива с методами put, get, remove*/

        OwnHashMap toys = new OwnHashMap();
        toys.getMyHashMap().put("Count balls",10);
        toys.getMyHashMap().put("Count dolls",20);
        toys.getMyHashMap().put("Count cars",15);
        toys.getMyHashMap().put("Count teddy bears",10);
        toys.getMyHashMap().put("Count bunnies",15);

        OwnHashMap clothes = new OwnHashMap();
        clothes.getMyHashMap().put("Count shirts",5);
        clothes.getMyHashMap().put("Count blouses",10);
        clothes.getMyHashMap().put("Count pants",20);
        clothes.getMyHashMap().put("Count hats",5);
        clothes.getMyHashMap().put("Count tops",30);

        toys.printHashMap();
        clothes.printHashMap();
        System.out.println(toys.getMyHashMap().get("Count teddy bears"));

        toys.getMyHashMap().remove("Count teddy bears",5);
        toys.printHashMap();



    /* TODO: 9/24/20
        2.1. Творческое задание. Реализвать систему учета данных о студентах (Имя, Фамилия, возраст,
        название группы в которой они учатся).
        2.2. Реализовать поиск студента с использованием функции хеширования.
        2.3. Сделать вывод результатов поиска в консоль. */



    }

}







