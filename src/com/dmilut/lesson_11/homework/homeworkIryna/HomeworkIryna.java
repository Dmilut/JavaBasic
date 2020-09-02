package com.dmilut.lesson_11.homework.homeworkIryna;


public class HomeworkIryna {

    public static void main(String[] args) {

        String[] cats = {"Ashley", "Zoya", "Lilly", "Goldy", "Bella"};
        int catNum = 1;
        int zero = 0;

        /* TODO: 8/31/20
        1.1. Реализовать метод c блоком try-catch-finally обрабатывающий деление числа на 0
     */


        try {
            int result = catNum / zero;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("you can`t devide by zero");
        }



    /* TODO: 8/31/20
        2.1. Реализовать метод c блоком try-catch-finally обрабатывающий выход за границы массива в цикле
     */
        try {
            cats[5] = "Fluffic";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I have added one more cat");
        }

    }


 /* TODO: 8/31/20
        3.1. Реализовать метод c генерацией собственного исключения
     */

    static void printString(String myMethod){
        if (myMethod==null){
            throw new NullPointerException("myMethod is null");
        }
        System.out.println("MyMethod is"+myMethod);
    }

    private static class MyException extends Exception{
        MyException(String blablabla){System.out.println("blablabla");
        }
    }

}
