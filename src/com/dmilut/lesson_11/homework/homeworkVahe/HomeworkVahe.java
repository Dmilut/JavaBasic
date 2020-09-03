package com.dmilut.lesson_11.homework.homeworkVahe;

public class HomeworkVahe {

    public static void main(String[] args) {

<<<<<<< HEAD
    }
}

=======
    /* TODO: 8/31/20
        1.1. Реализовать метод c блоком try-catch-finally обрабатывающий деление числа на 0
     */
        System.out.println("This is homework 1.1");

        zeroDivision(10);

        System.out.println();


    /* TODO: 8/31/20
        2.1. Реализовать метод c блоком try-catch-finally обрабатывающий выход за границы массива в цикле
    */

        System.out.println("This is homework 2.1");

        String[] studentNames = {"John", "James", "Peter", "Matthew"};

        outOfBounds(studentNames);

        System.out.println();

    /* TODO: 8/31/20
        3.1. Реализовать метод c генерацией собственного исключения
    */

        System.out.println("This is homework 3.1");

        try {
            checkIfContainsSubstring("Vahe Gemilyan", "Saint Peter");
        } catch (MyException e) {
            e.getMessage();
        }
        finally {
            System.out.println("Homework done.");
        }
    }

    // 1.1 method
    public static void zeroDivision (int number){
        try {
            int i = number / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("You cannot divide by zero");
        }
    }

    // 2.1 method
    public static void outOfBounds (String[] array){
        int length = array.length;
        try {
            array[length] = "Paul";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bounds for given array are from 0 to " + (length - 1));
        }
    }

    // 3.1 method
    public static void checkIfContainsSubstring(String text, String substring) throws MyException {
        String s = null;
        try {
            if (text.contains(substring)){
                s = "match";
            }
            s.contains("match");
        } catch (NullPointerException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

        if (s == null) {
            throw new MyException("String cannot be empty!");
        }
    }
}
>>>>>>> cfb7e163d3c28aa4adea3352da09b2f87c7d97c2
