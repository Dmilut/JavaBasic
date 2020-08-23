package com.dmilut.lesson_07.homework.homeworkIrina;

public class HomeworkIrina {


    public static void main(String[] args) {


        System.out.println("Ex 1");
        System.out.println(true);
        System.out.println(true);

        System.out.println("Ex 2");
        System.out.println("Ex 3");

         /* TODO: 8/17/20
            2.1. Создать экземпляр класса Fish используя пустой конструктор
            2.2. Создать экземпляр класса Fish используя конструктор для инициализации полей */

        Fish fish1 = new Fish();
        fish1.color = "white";
        fish1.age = 1;
        fish1.size = 30;

        Fish fish2 = new Fish("Tommy", 30, 5, "red", false);

        boolean isBiggerFish = comparison(fish1, fish2);
        System.out.println(isBiggerFish);
        System.out.println("Ex 4");
    }
    //  Easy level
        /* TODO: 8/17/20
            1.1. Реализовать класс Fish
            1.2. Реализовать поля класса Fish: name, size, color, edible
            1.3. Реализовать методы класса Fish: swim, eat
            1.4. Создать пустой конструктор класса Fish
            1.5. Создать конструктор класса Fish с аргументами в виде полей класса */

    public static class Fish {
        public String color;
        public String name;
        public int size;
        public boolean edible;
        public int age;

        public boolean swim() {
            return true;
        }

        public boolean eat() {
            return true;
        }

        public Fish() {
        }

        public Fish(String constructorName, int constructorSize, int constructorAge, String constructorColor, boolean constructorEdible) {
            this.age = constructorAge;
            this.name = constructorName;
            this.size = constructorSize;
            this.color = constructorColor;
            this.edible = constructorEdible;

        }
    }

        /* TODO: 8/17/20
            3.1. Создать static метод, который будет сравнивать размер двух рыб и выводить в консоль название
            большей рыбы */


    public static boolean comparison(Fish salmon, Fish herring) {
        boolean isBigger;
        if (salmon.size > herring.size) {
            isBigger = true;
        } else {
            isBigger = false;
        }
        return isBigger;

    }


//  Hard level
        /* TODO: 8/17/20
            4.1. Создать массив Fish
            4.2. Заполнить массив 5 произвольными объектами Fish с инициализированными полями
            4.3. Создать static метод, который будет искать самую большую рыбу и выводить в консоль текст вида "Эта рыба
             вот такого размера ..."
            4.4. Создать static метод, который будет проверять съедобна эта рыба или нет и выводить в консоль "И ее
             можно съесть!" или "Но ее нельзя съесть!" */


//    public static class Fishes {
//        public static void fish () {
//            String[] Fishes = {"Salmon", "Cod", "Herring", "Tuna", "Shark"};
//            String salmon = new String();
//            salmon.
//
//
//        }
//    }
}





