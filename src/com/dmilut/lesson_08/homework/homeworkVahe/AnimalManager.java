package com.dmilut.lesson_08.homework.homeworkVahe;

public class AnimalManager {
    // Hard level
    /* TODO: 8/20/20
        7.1. Реализовать класс AnimalManager
        7.2. В созданном классе реализовать поле - массив размерностью 100 в который можно помещать ссылки на объекты
            Monkey и Dog
        7.3. Закрыть доступ к массиву из других классов
        7.4. Для работы с массивом из других классов реализовать методы addAnimal, updateAnimal, deleteAnimal. Учитывая,
        что все записи в массиве должны храниться подряд (без пустых ячеек между ними).
     */

    public static final int ANIMAL_MANAGER_SIZE = 100;
    private static Animal [] animals = new Animal[ANIMAL_MANAGER_SIZE];

    public void addAnimal(Animal animal) {
        int index = getAnimalCount();
        AnimalManager.animals[index] = animal;
    }

    public void updateAnimal(Animal animal, int index) {
        AnimalManager.animals[index] = animal;
    }

    public void deleteAnimal(int index) {
        AnimalManager.animals[index] = null;
    }

    public void printAnimal(int index) {
        System.out.println("The " + (index + 1) + " animal's name is " + animals[index].name +
                ". The " + (index + 1) + " animal's age is " + animals[index].age +
                ". The " + (index + 1) + " animal's type is " + animals[index].type +
                ". The " + (index + 1) + " animal's color is " + animals[index].color);
    }

    public int getAnimalCount() {
        int index = 0;
        for (int i = 0; i < AnimalManager.animals.length; i++) {
            if (AnimalManager.animals[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }
}

