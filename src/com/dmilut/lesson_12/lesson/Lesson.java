package com.dmilut.lesson_12.lesson;

import com.dmilut.lesson_12.lesson.cloneDemo.Car;
import com.dmilut.lesson_12.lesson.cloneDemo.Driver;

public class Lesson {

    public static void main(String[] args) throws CloneNotSupportedException {

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
}