package com.dmilut.lesson_18.homework.homeworkVahe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkVahe {

    public static void main(String[] args) {


    /* TODO: 9/24/20
        1.1. Реализовать собственный вариант ассоциативного массива с методами put, get, remove */

        VahesHashMap fruits = new VahesHashMap();
        fruits.getMyHashMap().put("Количество апельсинов", 5);
        fruits.getMyHashMap().put("Количество яблок", 10);
        fruits.getMyHashMap().put("Количество мандаринов", 7);
        VahesHashMap milkProducts = new VahesHashMap();
        milkProducts.getMyHashMap().put("Количество пачек творога", 2);
        milkProducts.getMyHashMap().put("Количество пакетов молока", 3);
        milkProducts.getMyHashMap().put("Количество банок сметаны", 17);

        fruits.printHashMap();
        System.out.println(milkProducts.getMyHashMap().get("Количество пакетов молока"));
        milkProducts.printHashMap();
        fruits.getMyHashMap().remove("Количество апельсинов", 5);
        fruits.printHashMap();

    /* TODO: 9/24/20
        2.1. Творческое задание. Реализвать систему учета данных о студентах (Имя, Фамилия, возраст,
        название группы в которой они учатся).
        2.2. Реализовать поиск студента с использованием функции хеширования.
        2.3. Сделать вывод результатов поиска в консоль. */

        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(new Student("John", "Smith1", 16, "456a"));
        studentManager.addStudent(new Student("Johnn", "Smith2", 17, "457b"));
        studentManager.addStudent(new Student("Johnny", "Smith3", 18, "458c"));

        studentManager.printAllStudents();

        System.out.println("Please input the hash for the student you want to search:");

        try {
            studentManager.printStudent(studentManager.findStudent(Integer.parseInt(inputText())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String inputText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        return text;
    }
}













