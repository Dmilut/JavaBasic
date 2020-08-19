package com.dmilut.lesson_07.homework.reference;

public class Main {


    public static void main(String[] args) {

            /* TODO: 8/17/20
        2.1. Создать экземпляр класса Fish используя пустой конструктор
        2.2. Создать экземпляр класса Fish используя конструктор для инициализации полей */

        Fish fish = new Fish();
        Fish fish1 = new Fish("testNam1", 10, "gray", true);
        Fish fish2 = new Fish("testName2", 15, "blue", false);
        Fish fish3 = new Fish("testName3", 5, "yellow", false);
        Fish fish4 = new Fish("testName4", 25, "green", false);
        Fish fish5 = new Fish("testName5", 1, "red", true);

        Fish[] fishes = {fish1, fish2, fish3, fish4, fish5};

        compareFish(fish1, fish2);

        isBiggestFish(fishes);

        isEdibleFish(isBiggestFish(fishes));

    }

    /* TODO: 8/17/20
        3.1. Создать static метод, который будет сравнивать размер двух рыб и выводить в консоль название
        большей рыбы */

    public static void compareFish(Fish fish, Fish fish1) {
        if (fish.size > fish1.size) {
            System.out.println(fish.name + " больше чем " + fish1.name + " !");
        } else {
            System.out.println(fish1.name + " больше чем " + fish.name + " !");
        }
    }

    /* TODO: 8/17/20
        4.1. Создать массив Fish
        4.2. Заполнить массив 5 произвольными объектами Fish с инициализированными полями
        4.3. Создать static метод, который будет искать самую большую рыбу и выводить в консоль текст вида "Эта рыба
        вот такого размера ..."
        4.4. Создать static метод, который будет проверять съедобна эта рыба или нет и выводить в консоль "И ее
        можно съесть!" или "Но ее нельзя съесть!" */

    Fish fish1 = new Fish("testNam1", 10, "gray", true);
    Fish fish2 = new Fish("testName2", 15, "blue", false);
    Fish fish3 = new Fish("testName3", 5, "yellow", false);
    Fish fish4 = new Fish("testName4", 25, "green", false);
    Fish fish5 = new Fish("testName5", 1, "red", true);

    Fish[] fishes = {fish1, fish2, fish3, fish4, fish5};

    public static Fish isBiggestFish(Fish[] fishes) {
        Fish comparedFish = fishes[0];

        for (int i = 0; i < fishes.length; i++) {
            if (comparedFish.size < fishes[i].size) {
                comparedFish = fishes[i];
            }
        }

        System.out.println("Эта рыба вот такого размера " + comparedFish.size);

        return comparedFish;
    }

    public static void isEdibleFish(Fish fish) {

        if (fish.edible) {
            System.out.println("И ее можно съесть!");
        } else {
            System.out.println("Но ее нельзя съесть!");
        }
    }

}
