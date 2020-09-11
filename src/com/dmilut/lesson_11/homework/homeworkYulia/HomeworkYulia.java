package com.dmilut.lesson_11.homework.homeworkYulia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkYulia {

    public static void main(String[] args) throws MyException {
        divideWithZero();
        outOfBoundaryException();
        input();


    }

    public static void divideWithZero() {
        System.out.println("Task 1. Try-catch-finally with 0");
        
        /* TODO: 8/31/20
        1.1. Реализовать метод c блоком try-catch-finally обрабатывающий деление числа на 0
     */
        int a = 0;
        int b = 5;
        int c;
        //System.out.println(c);

        try {
            c = b / a;
        } catch (Exception e) {
            System.out.println("No error message when dividing by zero");

        } finally {
            System.out.println("Operation is completed");
        }
    }

    /* TODO: 8/31/20
       2.1. Реализовать метод c блоком try-catch-finally обрабатывающий выход за границы массива в цикле
    */
    public static void outOfBoundaryException() {
        System.out.println("Task 2: try-catch-finally out of boundary exception");
        String[] array = {"one", "two", null, "four", "five"};

        for (String a : array) {
            try {
                System.out.println(a + ", length:" + a.length());
            } catch (NullPointerException e) {
                System.out.println("We've catched the exception");
            } finally {
                System.out.println("We are in finally block");
            }
        }
    }

    /* TODO: 8/31/20
     3.1. Реализовать метод c генерацией собственного исключения
  */
    public static String input() throws MyException {
        System.out.println("Task 3: My own exception");
        String b = "none";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            b = reader.readLine();
        } catch (IOException e) {
            System.out.println("Exception was caught");
        }
        if (b.equals("none")) {
            throw new MyException("You cannot type <none> as input");
        }

        return b;
    }

    private static class MyException extends Exception {

        MyException(String message) {
            System.out.println(message);
        }
    }


}