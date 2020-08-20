package com.dmilut.lesson_07.homework.homeworkOlga;

public class Fish2{
            /* TODO: 8/17/20
            2.1. Создать экземпляр класса Fish используя пустой конструктор
            2.2. Создать экземпляр класса Fish используя конструктор для инициализации полей */

    public static void main(String[] args) {
        Fish goldfish= new Fish();
        goldfish.color= "gold";

        Fish goldfish2= new Fish("goldy", 15, "gold", true);

    }
            /* TODO: 8/17/20
           3.1. Создать static метод, который будет сравнивать размер двух рыб и выводить в консоль название
           большей рыбы */
    public static void fishComparison () {
        Fish goldfish3 = new Fish("Ted", 30, "white", false);
        Fish goldfish4 = new Fish("Molly", 25, "blue", false);
        if (goldfish3.size > goldfish4.size) {
            System.out.println(goldfish3.name);
        } else if (goldfish3.size < goldfish4.size) {
            System.out.println(goldfish4.name);
        } else {
            System.out.println("Fishes are equal");
        }
    }
        //  Hard level
                    /* TODO: 8/17/20
                    4.1. Создать массив Fish
                    4.2. Заполнить массив 5 произвольными объектами Fish с инициализированными полями
                    4.3. Создать static метод, который будет искать самую большую рыбу и выводить в консоль текст вида "Эта рыба
                     вот такого размера ..."
                    4.4. Создать static метод, который будет проверять съедобна эта рыба или нет и выводить в консоль "И ее
                     можно съесть!" или "Но ее нельзя съесть!" */

        Fish goldfish = new Fish ("Lily", 10, "pink", true);
        Fish goldfish1 = new Fish("Ron", 12, "purple", true);
        Fish goldfish2 = new Fish( "Laura", 20, "green", false);
        Fish goldfish3 = new Fish ( "Don", 25, "white", false);
        Fish goldfish4 = new Fish("Destiny", 15, "yellow", true);

        Fish[] fishes = {goldfish, goldfish1, goldfish2, goldfish3, goldfish4};

        public static void theBiggestFish (Fish[]fishes) {
            Fish maxFish = fishes[0];

            for (int i = 0; i < fishes.length; i++) {
                if (fishes[i].size > maxFish.size) {
                    maxFish = fishes[i];
                }
            }

            System.out.println("Эта рыба вот такого размера " + maxFish.size);

        }

        public static void edibleFish(Fish fish){
            Fish goldfish = new Fish ("Lily", 10, "pink", true);
            Fish goldfish1 = new Fish("Ron", 12, "purple", true);
            Fish goldfish2 = new Fish( "Laura", 20, "green", false);
            Fish goldfish3 = new Fish ( "Don", 25, "white", false);
            Fish goldfish4 = new Fish("Destiny", 15, "yellow", true);

            Fish[] fishes = {goldfish, goldfish1, goldfish2, goldfish3, goldfish4};

            for (int i = 0; i < fishes.length; i++) {
                if (fishes[i].edible = true) {
                    System.out.println("И ее можно съесть!"+ fishes[i] );

                } else{
                    System.out.println("Но ее нельзя съесть!"+ fishes[i] );
                }
            }
        }
    }

