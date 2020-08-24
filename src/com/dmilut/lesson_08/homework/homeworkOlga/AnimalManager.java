package com.dmilut.lesson_08.homework.homeworkOlga;

import java.util.ArrayList;

public class AnimalManager {
                // Hard level
                /* TODO: 8/20/20
                7.1. Реализовать класс AnimalManager
                7.2. В созданном классе реализовать поле - массив размерностью 100 в который можно помещать ссылки на объекты
                    Monkey и Dog
                7.3. Закрыть доступ к массиву из других классов
                7.4. Для работы с массивом из других классов реализовать методы addAnimal, updateAnimal, deleteAnimal. Учитывая,
                что все записи в массиве должны храниться подряд (без пустых ячеек между ними).
                7.5. В классе Homework... (в своем пакете) продемонстрировать работу созданных методов */


    private Object Monkey;

    public static final int AnimalManagerSize = 100;
    private static Animal[] animals = new Animal[AnimalManagerSize];


    public void addAnimal(Animal animal) {
        int emptySlotIndex = getFirstEmptySlotIndex();
        AnimalManager.animals[emptySlotIndex] = animal;
        }

    public void updateAnimal(Animal animal) {

        AnimalManager.animals[getFirstEmptySlotIndex()] = animal;
    }


    public void deleteAnimal(Animal animal) {

        AnimalManager.animals[getFirstEmptySlotIndex()] = null;
    }

    private int getFirstEmptySlotIndex() {
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
