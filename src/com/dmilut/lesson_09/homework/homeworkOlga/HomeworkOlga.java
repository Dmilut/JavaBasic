package com.dmilut.lesson_09.homework.homeworkOlga;

public class HomeworkOlga {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat Molly", 2, 5, "persian");
        Cat cat2 = new Cat("Cat Lola", 7, 8, "mane coone");
        Cat cat3 = new Cat("Cat Ted", 3, 6, "siberian");
        Cat cat4 = new Cat("Cat Fluffy", 1, 9, "ukraininan");
        Cat[] cats = {cat1, cat2, cat3, cat4};

        AnimalManager animalManager = new AnimalManager();
        animalManager.sortCat(cats);

        Food food1 = new Food();
        food1.setName("TestFood1");
        food1.setType("For adult");

        Food food2 = new Food();
        food2.setName("TestFood2");
        food2.setType("For young");

        Food[] foods = {food1, food2};

        animalManager.selectionOfFood(cats, foods);
    }
}











