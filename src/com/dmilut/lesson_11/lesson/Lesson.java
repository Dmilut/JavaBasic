package com.dmilut.lesson_11.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson {

    public static void main(String[] args) throws MyException {

        /* **********************************************************
        *   Обработка исключений
        *  **********************************************************
        try {
            // блок кода, где отслеживаются ошибки
        }
        catch (тип_исключения_1 exceptionObject) {
            // обрабатываем ошибку
        }
        catch (тип_исключения_2 exceptionObject) {
            // обрабатываем ошибку
        }
        finally {
            // код, который нужно выполнить после завершения блока try
        } */

        String[] list = {"first step", null, "second step"};

        //printArray(list);
        //printString(null);
        input();
    }

    // try-catch-finally
    static void printArray(String[] list) {

        for (String s : list) {

            try {
                printString(s);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            } finally {
                System.out.println("Inside bloсk finally");
            }
            System.out.println("Go program.......");
            System.out.println("-----------------");

        }

    }


    // Генерация исключения
    static void printString(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }


    //try-with-resources
    public static String input() throws MyException {
        String s = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (s.equals("")) {
            throw new MyException("String can not be empty!");
        }
        return s;
    }

    // Создание собственного исключения
    private static class MyException extends Exception {

        MyException(String message) {
            System.out.println(message);
        }
    }
}