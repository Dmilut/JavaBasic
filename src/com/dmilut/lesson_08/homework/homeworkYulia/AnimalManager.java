package com.dmilut.lesson_08.homework.homeworkYulia;

public class AnimalManager {

       /* TODO: 8/20/20
        7.1. Реализовать класс AnimalManager
        7.2. В созданном классе реализовать поле - массив размерностью 100 в который можно помещать ссылки на объекты
            Monkey и Dog
        7.3. Закрыть доступ к массиву из других классов
        7.4. Для работы с массивом из других классов реализовать методы addAnimal, updateAnimal, deleteAnimal. Учитывая,
        что все записи в массиве должны храниться подряд (без пустых ячеек между ними).
        7.5. В классе Homework... (в своем пакете) продемонстрировать работу созданных методов */

    private Animal[] animals = new Animal[100];

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    public boolean updateAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].name.equals(animal.name)) {
                animals[i] = animal;
                return true;
            }

        }
        return false;
    }

    public boolean deleteAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].name.equals(animal.name)) {
                animals[i].name = null;
            }
        }
        return false;
    }

}
