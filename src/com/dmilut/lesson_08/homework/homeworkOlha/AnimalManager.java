package com.dmilut.lesson_08.homework.homeworkOlha;

    // Hard level
    /* TODO: 8/20/20
        7.1. Реализовать класс AnimalManager
        7.2. В созданном классе реализовать поле - массив размерностью 100 в который можно помещать ссылки на объекты
            Monkey и Dog
        7.3. Закрыть доступ к массиву из других классов
        7.4. Реализовать методы для работы с массивом из других классов addAnimal, updateAnimal, deleteAnimal. Учитывая,
        что все записи в массиве должны храниться подряд без пустых ячеек между ними.
        7.5. В классе Homework... (в своем пакете) продемонстрировать работу созданных методов */


public class AnimalManager {

    public static final int ANIMALMANAGER_SIZE;

    static {
        ANIMALMANAGER_SIZE = 100;
    }

    protected static Animal[] animals;

    static {
        animals = new Animal[ANIMALMANAGER_SIZE];
    }

    public void addAnimal(Animal animal) {
        int index = getAnimalCount();

    }

    private int getAnimalCount() {
        return 0;
    }

}


