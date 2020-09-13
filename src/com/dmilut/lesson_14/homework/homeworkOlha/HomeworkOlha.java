package com.dmilut.lesson_14.homework.homeworkOlha;

import java.util.ArrayList;
import java.util.LinkedList;

public class HomeworkOlha {

    public static void main(String[] args) {


    /* TODO: 9/10/20
        1.1. Реализовать сортировку выбором с помощью рекурсии */

        System.out.println("Task 1.1");






    /* TODO: 9/10/20
        2.1. Реализовать custom Array List (сделать свою реализацию) с методами add, remove, get, set */

        System.out.println("\n Task 2.1");

        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Steve");
        aList.add("Lucy");
        aList.add("Pat");
        aList.add("Angela");
        //displaying elements
        System.out.println(aList);

        //.get
        //Getting the object list which is present at the specified index
        Object firstvar = aList.get(0);
        System.out.println("First element: " + firstvar);


        //.add
        // Adding "Fabian" at the second position
        aList.add(1, "Fabian");
        //displaying elements
        System.out.println(aList);


        //.set
        // Setting "Adrian" to the first position
        aList.set(0, "Adrian");
        //displaying elements
        System.out.println(aList);

        //.remove
        //Removing the object "Pat from the ArrayList
        aList.remove("Pat");
        //displaying elements
        System.out.println(aList);

        //Removing element from a given index
        aList.remove(2);
        //displaying elements
        System.out.println(aList);



    /* TODO: 9/10/20
        3.1. Реализовать custom Linked List (сделать свою реализацию) с методами add, remove, get, set */

        System.out.println("\n Task 2.1");

        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to tsorthe Linked list
        list.add("Strawberry");
        list.add("Huckleberry");
        list.add("Raspberry");

        //displaying elements
        System.out.println(list);

        //.add
        //Adding an element to the first position
        list.addFirst("Blueberry");
        //displaying elements
        System.out.println(list);


        //Adding an element to the last position
        list.addLast("Cherry");
        //displaying elements
        System.out.println(list);


        //Adding an element to the 3rd position
        list.add(2, "Blackberry");
        //displaying elements
        System.out.println(list);

        //.remove
        //Removing First element
        list.removeFirst();
        //displaying elements
        System.out.println(list);


        //Removing Last element
        list.removeLast();
        //displaying elements
        System.out.println(list);


        //Removing element from a given index
        list.remove(0);
        //displaying elements
        System.out.println(list);


        //.get
        //Getting the object list which is present at the specified index
        Object firstvar1 = list.get(0);
        System.out.println("First element: " + firstvar1);


        //.set
        // Setting "Apple" to the first position
        list.set(0, "Apple");
        //displaying elements
        System.out.println(list);

    }
}
