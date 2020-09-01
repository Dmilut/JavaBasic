package com.dmilut.lesson_09.homework.homeworkOlga;

/* TODO: 8/24/20
    6.1. Реализовать класс AnimalManager
    6.2. Реализовать методы в котором кошки и собаки будут сортироваться в зависимости от возраста на 2 категории:
        щенки (котята) и взрослые особи
    6.3. Реализовать методы в котором кошки и собаки будут складываться в массивы puppies, kittens, dogs, cats
        в зависимости от результата работы методов из п. 6.3. */
public class AnimalManager {

    public void sortCat(Cat[] cats) {
        int middleAge = 1;

        for (int i = 0; i < cats.length; i++) {

            if (cats[i].age <= middleAge) {
                System.out.println("Kittens: " + cats[i].name);
            } else {
                System.out.println("Adult cats:" + cats[i].name);
            }
        }
    }

    /* TODO: 8/24/20
        7.1. Творческое задание. Реализовать метод selectionOfFood в классе AnimalManager в котором животное будет
        проверяться на наличие в массивах puppies, kittens, dogs, cats и в зависимости от того, щенок (котенок) это
        или взрослая особь, будет предлагаться соответствующее питание. */

    public void selectionOfFood(Mammal[] mammals, Food[] foods) {
        int middleAge = 1;

        for (int i = 0; i < mammals.length; i++) {

            if (mammals[i].age <= middleAge) {
                for (Food food : foods) {
                    if (food.getType().equals("For young")) {

                        System.out.println("Name " + mammals[i].name + " got " + food.getType());
                    }
                }
            } else {
                for (Food food : foods) {
                    if (food.getType().equals("For adult")) {
                        System.out.println("Name " + mammals[i].name + " got " + food.getType());
                    }
                }
            }
        }
    }

}
