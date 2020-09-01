package com.dmilut.lesson_09.homework.homeworkOlha;

public class AnimalManager {
    // Medium level
    /* TODO: 8/24/20
        6.1. Реализовать класс AnimalManager
        6.2. Реализовать методы в котором кошки и собаки будут сортироваться в зависимости от возраста на 2 категории:
         щенки (котята) и взрослые особи
        6.3. Реализовать методы в котором кошки и собаки будут складываться в массивы puppies, kittens, dogs, cats
        в зависимости от результата работы методов из п. 6.2. */

    public void sortMammal(Mammal[] mammals) {
        int middleAge = 12;


        for (Mammal mammal : mammals) {
            if (mammal instanceof Dog) {

                if (mammal.getAge() <= middleAge) {
                    System.out.println(mammal.getName() + " is puppy!");
                } else {
                    System.out.println(mammal.getName() + " is dog!");
                }

            } else {

                if (mammal.getAge() <= middleAge) {
                    System.out.println(mammal.getName() + " is kitty!");
                } else {
                    System.out.println(mammal.getName() + " is cat!");
                }
            }


        }
    }


    public void sortCat(Cat cat) {
        int middleAge = 1;
        if (cat.getAge() <= middleAge) {
            System.out.println(cat.getName() + " is kitty!");
        } else {
            System.out.println(cat.getName() + " is adult!");
        }
    }

    public void sortCat(Dog dog) {
        int middleAge = 1;
        if (dog.getAge() <= middleAge) {
            System.out.println(dog.getName() + " is puppy!");
        } else {
            System.out.println(dog.getName() + " is adult!");
        }
    }


}
