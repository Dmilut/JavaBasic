package com.dmilut.lesson_08.homework.homeworkIrina;

public class HomeworkIrina {

    /* TODO: 8/20/20
      4.1. Создать объект класса Animal, инициализировать его поля и вывести их значения в консоль
      4.2. У созданного объекта класса Animal вызвать методы eat, sleep и move */
    public void Animal(String name, int age, String type, String color) {
        Animal animal = new Animal("Max ", 3, " striped ", " orange ");
        System.out.println(name + age + type + color);
    }

    public void tigerMove() {
        System.out.println("Some movement");
    }

    public void tigerEat() {
        System.out.println("It eats");
    }

    public void tigerSleep() {
        System.out.println("It sleeps");
    }



    /* TODO: 8/20/20
        5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
        5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move */

    public void Monkey(String name, int age, String type, String color) {
        //super.clone(name, age, type,color).equals(Animal();)
        Monkey monkey = new Monkey("Dasha", 10, "ape", "black");
        System.out.println(name + age + type + color);
    }


    public void monkeyEat() {
        System.out.println("It eats bananas");
    }

    public void monkeySleep() {
        System.out.println("It sleeps like person");
    }

    public void monkeyMove() {
        System.out.println("It jumps funny");
    }


    /* TODO: 8/20/20
       6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
       6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark
       6.3. У созданного объекта класса Dog вызвать унаследованный метод move */

    public void Dog(String name, int age, String type, String color) {
    Dog dog = new Dog("Betty", 6, "yorkie", "silver");
    System.out.println(name + age + type + color);
    }

    public void dogEat() {
        System.out.println("It eats bone");
    }

    public void dogSleep() {
        System.out.println("It sleeps on the bed");
    }

    public void dogMove() {
        System.out.println("It dances cute");
    }

    public void dogBark() {
        System.out.println("It barks loudly");
    }
    // не понимаю как это сделать  6.3. У созданного объекта класса Dog вызвать унаследованный метод move */

//    @Override
//    public void move(String move) {
//        super.move(move);
//        System.out.println("Climbing the trees");
//    }


    public static void main(String[] args) {


        // Hard level
    /* TODO: 8/20/20
        7.1. Реализовать класс AnimalManager
        7.2. В созданном классе реализовать поле - массив размерностью 100 в который можно помещать ссылки на объекты
            Monkey и Dog
        7.3. Закрыть доступ к массиву из других классов
        7.4. Для работы с массивом из других классов реализовать методы addAnimal, updateAnimal, deleteAnimal. Учитывая,
        что все записи в массиве должны храниться подряд (без пустых ячеек между ними).
        7.5. В классе Homework... (в своем пакете) продемонстрировать работу созданных методов */


    }
}

