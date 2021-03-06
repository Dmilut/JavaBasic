package com.dmilut.lesson_08.homework.reference;

// Hard level
/* TODO: 8/20/20
    7.1. Реализовать класс AnimalManager

    7.4. Для работы с массивом из других классов реализовать методы addAnimal, updateAnimal, deleteAnimal. Учитывая,
        что все записи в массиве должны храниться подряд (без пустых ячеек между ними).  */

public class AnimalManager {

    /* TODO: 8/20/20
        7.2. В созданном классе реализовать поле - массив размерностью 100 в который можно помещать ссылки на объекты
            Monkey и Dog
        7.3. Закрыть доступ к массиву из других классов */
    private Animal[] animals;

    public AnimalManager() {
        animals = new Animal[100];
    }

    /* TODO: 8/20/20
        7.4. Для работы с массивом из других классов реализовать методы addAnimal, updateAnimal, deleteAnimal. Учитывая,
        что все записи в массиве должны храниться подряд (без пустых ячеек между ними). */

    public void addAnimal(Animal animal) {
        int indexOfFirstEmptySlot = getIndexOfFirstEmptySlot();

        animals[indexOfFirstEmptySlot] = animal;
    }


    public void updateAnimal(Animal animal) {
        int index = getIndexByName(animal);

        animals[index] = animal;
    }


    public void deleteAnimal(Animal animal) {
        int index = getIndexByName(animal);

        animals[index] = null;
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Name = " + animal.name + "; age = " + animal.age + "; color = " + animal.color + "; type = " + animal.type);
            }
        }
    }

    private int getIndexOfFirstEmptySlot() {
        int indexOfFirstEmptySlot = 0;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                indexOfFirstEmptySlot = i;
                break;
            }
        }

        return indexOfFirstEmptySlot;
    }

    private int getIndexByName(Animal animal) {
        int index = 0;

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null) {
                if (animals[i].name.equals(animal.name)) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }


}
