package com.dmilut.lesson_07.homework.Olga;

import com.dmilut.lesson_05.homework.HomeworkOlga;

public class Fish2 {
            /* TODO: 8/17/20
            2.1. Создать экземпляр класса Fish используя пустой конструктор
            2.2. Создать экземпляр класса Fish используя конструктор для инициализации полей */

    static Fish[] fishes = new Fish [5];
    public static void main(String[] args) {
        Fish goldfish= new Fish();
        goldfish.color= "gold";

        Fish goldfish2= new Fish("goldy", 15, "gold", true);

    }
            /* TODO: 8/17/20
           3.1. Создать static метод, который будет сравнивать размер двух рыб и выводить в консоль название
           большей рыбы */
    public static void fishComparison (){
        Fish goldfish3= new Fish ("Ted",30, "white",false);
        Fish goldfish4= new Fish ("Molly", 25, "blue", false);
        if (goldfish3.size > goldfish4.size){
            System.out.println(goldfish3.name);
        }
        else if (goldfish3.size < goldfish4.size){
            System.out.println(goldfish4.name);
        }
        else {
            System.out.println("Fishes are equal");
        }

        fishes[0] = new Fish("Lily", 10, "pink", true);
        fishes[1] = new Fish("Ron", 12, "purple", true );
        fishes[2] = goldfish3;
        fishes[3] = goldfish4;
        fishes[4] = new Fish ("Destiny", 15, "yellow", true);



        }

    }

