package com.dmilut.lesson_11.homework.homeworkOlga;

public class HomeworkOlga {

    public static void main(String[] args) throws MyException {


                /* TODO: 8/31/20
                1.1. Реализовать метод c блоком try-catch-finally обрабатывающий деление числа на 0
                */

        String[] animals = {"dog", "cat", "bunny", "tortoise"};
        int animalNum = 1;
        int zero = 0;
        try {
            int divide = animalNum / zero;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Animals can't be divided by 0");
        }



                /* TODO: 8/31/20
                2.1. Реализовать метод c блоком try-catch-finally обрабатывающий выход за границы массива в цикле
                */

        try {
            animals[4] = "hamster";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exception was processed");
        }

    }


                /* TODO: 8/31/20
                    3.1. Реализовать метод c генерацией собственного исключения
                 */

    static void printString(String a) throws MyException {
        if (a == null) {
            throw new MyException("String is empty");
        }
        System.out.println("Print String:" + a);
    }

    private static class MyException extends Exception {
        MyException(String message) {
            System.out.println(message);
        }
    }
}













