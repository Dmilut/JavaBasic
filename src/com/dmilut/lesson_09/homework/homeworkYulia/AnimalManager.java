package com.dmilut.lesson_09.homework.homeworkYulia;

public class AnimalManager {

    // Medium level
    /* TODO: 8/24/20
        6.1. Реализовать класс AnimalManager
        6.2. Реализовать методы в котором кошки и собаки будут сортироваться в зависимости от возраста на 2 категории:
         щенки (котята) и взрослые особи
        6.3. Реализовать методы в котором кошки и собаки будут складываться в массивы puppies, kittens, dogs, cats
        в зависимости от результата работы методов из п. 6.3. */

    private Cat[] cats = new Cat[100];
    private Cat[] kittens = new Cat[100];
    private Dog[] dogs = new Dog[100];
    private Dog[] puppies = new Dog[100];

    public void printCats(Cat[] cats, String text) {
        System.out.println("********* " + text.toUpperCase() + " **********");
        for (Cat cat : cats) {
            if (cat != null) {
                System.out.println(cat);
            }
        }
        System.out.println("*******************");
    }

    public void printDogs(Dog[] dogs, String text) {
        System.out.println("********* " + text.toUpperCase() + " **********");
        for (Dog dog : dogs) {
            if (dog != null) {
                System.out.println(dog);
            }
        }
        System.out.println("*******************");
    }

    public void printAll() {
        printCats(kittens, "kittens");
        printCats(cats, "cats");
        printDogs(dogs, "dogs");
        printDogs(puppies, "puppies");
    }

    private boolean addCat(Cat cat, Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            if (cats[i] == null) {
                cats[i] = cat;
                return true;
            }
        }
        return false;
    }

    private boolean addDog(Dog dog, Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] == null) {
                dogs[i] = dog;
                return true;
            }
        }
        return false;
    }

    public boolean sortAndAddCat(Cat cat) {
        if (cat.getAge() <= 2) {
            return addCat(cat, kittens);
        } else {
            return addCat(cat, cats);
        }
    }

    public boolean sortAndAddDog(Dog dog) {
        if (dog.getAge() <= 2) {
            return addDog(dog, puppies);
        } else {
            return addDog(dog, dogs);
        }
    }

    // Hard level
    /* TODO: 8/24/20
        7.1. Творческое задание. Реализовать метод selectionOfFood в классе AnimalManager в котором животное будет
        проверяться на наличие в массивах puppies, kittens, dogs, cats и в зависимости от того, щенок (котенок) это
        или взрослая особь, будет предлагаться соответствующее питание. */

    public String selectionOfFood(String name) {
        for(Cat cat : cats) {
            if(cat != null && cat.getName().equals(name)) {
                return "This is an adult cat. Feed this animal with meat or cat food";
            }
        }
        for(Cat kitten : kittens) {
            if(kitten != null && kitten.getName().equals(name)) {
                return "This is a kitten. Fed him with milk";
            }
        }
        for(Dog dog : dogs) {
            if(dog != null && dog.getName().equals(name)) {
                return "This is a dog. Feed him with meat or dog food";
            }
        }
        for (Dog puppie : puppies) {
                if(puppie != null && puppie.getName().equals(name)) {
                    return "This is a puppie. Feed him with milk or cottage cheese.";
                }
        }
        return "Sorry, there is no pet with name " + name + " in our database";
    }
}
