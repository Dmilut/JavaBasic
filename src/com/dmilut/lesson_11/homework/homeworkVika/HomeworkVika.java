package com.dmilut.lesson_11.homework.homeworkVika;

public class HomeworkVika {

    public static void main(String[] args) {

<<<<<<< HEAD
=======
        System.out.println(" 1.1. Реализовать метод c блоком try-catch-finally обрабатывающий деление числа на 0");

        int catNumber;
        int zero;

        try {
            catNumber = 1;
            zero = 0;
            int result = catNumber / zero;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Нельзя делить на ноль");
        }

        System.out.println("2.1. Реализовать метод c блоком try-catch-finally обрабатывающий выход за границы массива в цикле");

        int[] number ={2,5,7,8};

        try {
            number[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
        } finally {

            System.out.println("Вы вышли за массив");
        }

        System.out.println(" 3.1. Реализовать метод c генерацией собственного исключения");

        Dog dog = new Dog("Trump");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + dog.isCollarPutOn + "\r\n Поводок надет? "
                    + dog.isLeashPutOn + "\r\n Намордник надет? " + dog.isMuzzlePutOn);
        }



>>>>>>> cfb7e163d3c28aa4adea3352da09b2f87c7d97c2
    }
}








