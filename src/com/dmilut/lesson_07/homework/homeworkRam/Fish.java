package com.dmilut.lesson_07.homework.homeworkRam;

public class Fish {


//        System.out.println(" Задание №1");

    //  Easy level
        /* TODO: 8/17/20
            1.1. Реализовать класс Fish
            1.2. Реализовать поля класса Fish: name, size, color, edible
            1.3. Реализовать методы класса Fish: swim, eat
            1.4. Создать пустой конструктор класса Fish
            1.5. Создать конструктор класса Fish с аргументами в виде полей класса */


    public String name;
    public String color;
    public int size;
    public boolean edible;



    public boolean isSwim(String speed) {
        if (speed.equals("fast")) {
            return true;
        }
        return false;

    }

    public Fish() {

    }


    public Fish(int size, String color, boolean edible) {
        this.color = color;



    }
//
//    public Fish(int size) {
//
//    }


    public boolean isEat(String poisonous) {
        boolean isEating = false;
        return isEating;


    }

    {
        System.out.println(" Задание №2");

       /* TODO: 8/17/20
            2.1. Создать экземпляр класса Fish используя пустой конструктор
            2.2. Создать экземпляр класса Fish используя конструктор для инициализации полей */


    }

    {
        System.out.println(" Задание №3");


        /* TODO: 8/17/20
            3.1. Создать static метод, который будет сравнивать размер двух рыб и выводить в консоль название
            большей рыбы */


//        public static void compare();
//        Fish fish1 = new Fish(30, "black", true);
//        Fish fish2 = new Fish(20, "red", false);
//        if (fish1.size >= fish2.size)
//
//        System.out.println(fish1);







    }



    }


