package com.dmilut.lesson_09.homework.homeworkVahe;

public class HomeworkVahe {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog puppy = new Dog();

        Cat cat = new Cat();
        Cat kitten = new Cat();

        // Test
        dog.setAge(5);
        dog.setName("TestDogName");

        puppy.setAge(2);
        puppy.setName("TestPuppyName");

        cat.setAge(7);
        cat.setName("TestCatName");

        kitten.setAge(1);
        kitten.setName("TestKittenName");

        AnimalManager animalManager = new AnimalManager();
        animalManager.sortDogsByAge(dog);
        animalManager.sortDogsByAge(puppy);

        animalManager.sortCatsByAge(cat);
        animalManager.sortCatsByAge(kitten);

        printAnimals(animalManager.dogs);
        printAnimals(animalManager.puppies);
        printAnimals(animalManager.cats);
        printAnimals(animalManager.kittens);
    }

    private static void printAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal != null) {
                if (animal instanceof Dog) {
                    Dog dog = (Dog) animal;
                    System.out.println("Dog name = " + dog.getName());
                } else {
                    Cat cat = (Cat) animal;
                    System.out.println("Cat name = " + cat.getName());
                }
            }
        }
    }
}

