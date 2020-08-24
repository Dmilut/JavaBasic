package com.dmilut.lesson_07.homework.homeworkIrina;

//public class Fish2 {
//
//    public static void main(String[] args) {
//        Fish Whale = new Fish("whale", "black", 10, 1000, false);
//
//        Fish cod = new Fish("Sara", "white", 11, 25, true);
//        Fish salmon = new Fish("Dora", "red", 5, 30, true);
//        Fish tuna = new Fish("Bob", "brown", 3, 40, true);
//        Fish shark = new Fish("Den", "grey", 5, 100, true);
//        Fish herring = new Fish("Sonya", "silver", 20, 25, true);
//        Fish[] fishes = {cod, salmon, tuna, shark, herring};
//
//        Fish smallFish = new Fish("sardine", "grey", 3, 20, true);
//        Fish bigFish = new Fish("whale", "black", 10, 1000, false);
//
//
//
//
//
//        /* TODO: 8/17/20
//            3.1. Создать static метод, который будет сравнивать размер двух рыб и выводить в консоль название
//            большей рыбы */
//
//
//        public static void isBigger(smallFish,bigFish) {
//
//            if (bigFish.size > smallFish.size) {
//                System.out.println(bigFish.name);
//            } else {
//                System.out.println(smallFish.name);
//            }
//        }
//        //  Hard level
//        /* TODO: 8/17/20
//            4.1. Создать массив Fish
//            4.2. Заполнить массив 5 произвольными объектами Fish с инициализированными полями
//            4.3. Создать static метод, который будет искать самую большую рыбу и выводить в консоль текст вида "Эта рыба
//             вот такого размера ..."
//            4.4. Создать static метод, который будет проверять съедобна эта рыба или нет и выводить в консоль "И ее
//             можно съесть!" или "Но ее нельзя съесть!" */
//
//        //Fish[] fishes = {cod, salmon, tuna, shark, herring};
//
//        public static void theBiggest (Fish[]fishes){
//            Fish maxFish = fishes[0];
//            for (int i = 0; i < fishes.length; i++) {
//                maxFish = fishes[i];
//                System.out.println("This fish is such big size" + maxFish.size);
//            }
//        }
//        public static void edible (Fish[]fishes){
//            for (int i = 0; i < fishes.length; i++) {
//                if (fishes[i].edible = true) {
//                    System.out.println("You can eat this fish!");
//                } else {
//                    System.out.println("you can`t eat this fish!");
//                }
//            }
//
//        }
//
//    }
//}
//
