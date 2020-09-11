package com.dmilut.lesson_14.lesson;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {

    public static void main(String[] args) {

        // Переменные для теста
        String testString = "Hello!";
        Integer testInteger = 56;

        String testString1 = "Bay!";
        Integer testInteger1 = 48;

        String testString2 = "Hello again!";
        Integer testInteger2 = 5;

        // Объявление и инициализация
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // Объявление и инициализация с явным указанием типа
        ArrayList<String> arrayList1 = new ArrayList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        // Добавление элемента в определенное место
        arrayList1.add(0, testString);
        linkedList1.add(0, testInteger);

        // Добавление элемента последним
        arrayList1.add(testString1);
        linkedList1.add(testInteger1);

        // Получение элемента по индексу
        System.out.println(arrayList1.get(0));
        System.out.println(linkedList1.get(0));

        // Получение индекса элемента
        System.out.println(arrayList1.indexOf(testString));
        System.out.println(linkedList1.indexOf(testInteger));

        // Замена элемента
        arrayList1.set(1, testString2);
        linkedList1.set(1, testInteger2);

        // Вывод в консоль всей коллекции в читаемом виде
        System.out.println(arrayList1.toString());
        System.out.println(linkedList1.toString());

        // Удаление элемента по индексу
        arrayList1.remove(0);
        linkedList1.remove(0);

        // Удаление элемента по значению
        arrayList1.remove(testString);
        linkedList1.remove(testInteger);

        // Вывод в консоль всей коллекции в читаемом виде
        System.out.println(arrayList1.toString());
        System.out.println(linkedList1.toString());

    }


}
