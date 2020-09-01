package com.dmilut.lesson_09.homework.homeworkVahe;

    /* TODO: 8/24/20
        6.1. Реализовать класс AnimalManager
        6.2. Реализовать методы в котором кошки и собаки будут сортироваться в зависимости от возраста на 2 категории:
         щенки (котята) и взрослые особи
        6.3. Реализовать методы в котором кошки и собаки будут складываться в массивы puppies, kittens, dogs, cats
        в зависимости от результата работы методов из п. 6.3. */

public class AnimalManager {

    public static final int MANAGER_CAPACITY = 50;

    public Dog[] puppies = new Dog[MANAGER_CAPACITY];
    public Dog[] dogs = new Dog[MANAGER_CAPACITY];
    public Cat[] kittens = new Cat[MANAGER_CAPACITY];
    public Cat[] cats = new Cat[MANAGER_CAPACITY];

    public void sortDogsByAge(Dog dog) {
        int index;
        if (dog.getAge() <= 2) {
            index = getAnimalCount("Puppies");
            puppies[index] = dog;
        } else {
            index = getAnimalCount("Dogs");
            dogs[index] = dog;
        }
    }

    public void sortCatsByAge(Cat cat) {
        int index;
        if (cat.getAge() <= 2) {
            index = getAnimalCount("Kittens");
            kittens[index] = cat;
        } else {
            index = getAnimalCount("Cats");
            cats[index] = cat;
        }
    }

    public int getAnimalCount(String type) {
        int index = 0;
        if (type == "Dogs") {
            for (int i = 0; i < dogs.length; i++) {
                if (dogs[i] == null) {
                    index = i;
                    break;
                }
            }
            return index;
        } else if (type == "Cats") {
            for (int i = 0; i < cats.length; i++) {
                if (cats[i] == null) {
                    index = i;
                    break;
                }
            }
            return index;
        } else if (type == "Kittens") {
            for (int i = 0; i < kittens.length; i++) {
                if (kittens[i] == null) {
                    index = i;
                    break;
                }
            }
            return index;
        } else if (type == "Puppies") {
            for (int i = 0; i < puppies.length; i++) {
                if (puppies[i] == null) {
                    index = i;
                    break;
                }
            }
            return index;
        }
        return index;
    }

    // Hard level
    /* TODO: 8/24/20
        7.1. Творческое задание. Реализовать метод selectionOfFood в классе AnimalManager в котором животное будет
        проверяться на наличие в массивах puppies, kittens, dogs, cats и в зависимости от того, щенок (котенок) это
        или взрослая особь, будет предлагаться соответствующее питание. */

    public String selectionOfFood(Dog dog) {
        if (dog.getAge() <= 2) {
            return "milk";
        } else {
            return "meat";
        }
    }

    public String selectionOfFood(Cat cat) {
        if (cat.getAge() <= 2) {
            return "milk";
        } else {
            return "meat";
        }
    }
}
