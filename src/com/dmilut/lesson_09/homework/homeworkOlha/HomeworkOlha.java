package com.dmilut.lesson_09.homework.homeworkOlha;

public class HomeworkOlha {

    public static void main(String[] args) {

        AnimalManager animalManager = new AnimalManager();
        Dog dog1 = new Dog();
        dog1.setName("TestDogName1");
        dog1.setAge(6);

        Dog dog2 = new Dog();
        dog2.setName("TestDogName2");
        dog2.setAge(24);

        Cat cat1 = new Cat();
        cat1.setName("TestCatName1");
        cat1.setAge(9);

        Cat cat2 = new Cat();
        cat2.setName("TestCatName2");
        cat2.setAge(36);

        Mammal[] mammals = {dog1, dog2, cat1, cat2};

        animalManager.sortMammal(mammals);

    }
}
