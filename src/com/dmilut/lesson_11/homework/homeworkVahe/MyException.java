package com.dmilut.lesson_11.homework.homeworkVahe;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyException extends Exception {

    MyException(String message) {
        System.out.println(message);
    }
}
