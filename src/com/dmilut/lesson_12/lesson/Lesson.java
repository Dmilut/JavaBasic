package com.dmilut.lesson_12.lesson;

import com.dmilut.lesson_12.lesson.cloneDemo.Car;
import com.dmilut.lesson_12.lesson.cloneDemo.Driver;
import com.dmilut.lesson_12.lesson.compareDemo.Person;
import com.dmilut.lesson_12.lesson.finalizeDemo.Cup;
import com.dmilut.lesson_12.lesson.finalizeDemo.Spoon;

public class Lesson {

    public static void main(String[] args) throws CloneNotSupportedException {

        //cloneDemo();
        //compareDemo();
        finalizeDemo();

    }

    private static void compareDemo() {

        Person person1 = new Person("Петров Иван Иванович", 56, false);
        Person person2 = new Person("Петров Иван Иванович", 56, false);
        Person person3 = person1;

        System.out.println("person1 == person2?\t\t\t" + (person1 == person2));
        System.out.println("person1 == person3?\t\t\t" + (person1 == person3));

        System.out.println("person1.equals(person2)?\t" + person1.equals(person2));
        System.out.println("person1.equals(person3)?\t" + person1.equals(person3));
    }

    private static void cloneDemo() throws CloneNotSupportedException {

        Car car = new Car("Грузовик", new Driver("Василий", 45));
        Car copiedCar = car;

        Car clonedCar = car.clone();
        System.out.println("Оригинал:\t" + car);
        System.out.println("Копия:\t\t" + car);
        System.out.println("Клон:\t\t" + clonedCar);

        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Вася");

        System.out.println("Оригинал после изменения имени водителя:\t" + car);
        System.out.println("Копия после изменения имени водителя:\t\t" + copiedCar);
        System.out.println("Клон после изменения имени водителя:\t\t" + clonedCar);

        System.out.println("Имя водителя:\t\t\t" + car.getDriver());
        System.out.println("Имя водителя у клона:\t" + clonedCar.getDriver());
    }

    private static void finalizeDemo() {
        Cup cup = new Cup(new Spoon());
        cup = null;
        System.gc();
    }
}