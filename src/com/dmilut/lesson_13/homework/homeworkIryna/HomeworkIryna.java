package com.dmilut.lesson_13.homework.homeworkIryna;

public class HomeworkIryna {
    // Easy level
    /* TODO: 9/7/20
        1.1. Написать метод реализующий алгоритм линейного поиска без использования циклов*/
    public static int linearSearch(int[] ints, int elementToSearch) {
        return elementToSearch;
    }
    public static void print (int elementToSearch, int index){

    }

    public static void print1 (int elementToSearch1, int index1){

    }
    public int recursionFucn(int[] ints1, int elementToSearch1) {
        int firstIndex = 0;
        int lastIndex = ints1.length - 1;
        System.out.println("Binary Search");
        recursionFucn(ints1, elementToSearch1);
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 4;

            if (ints1[middleIndex] == elementToSearch1) {
                return middleIndex;
            }

            else if (ints1[middleIndex] < elementToSearch1)
                firstIndex = middleIndex + 1;


            else if (ints1[middleIndex] > elementToSearch1)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        /*1.2. Продемонстрировать работу метода*/

        System.out.println("Linear search");
        int elementToSearch = 33;
        int index= linearSearch(new int[]{11,22,33,44,55,66,77,88,99}, elementToSearch);

        print(elementToSearch, index);
        System.out.println(elementToSearch);



        // Middle level
    /* TODO: 9/7/20
        2.1. Написать метод реализующий алгоритм бинарного поиска с использованием рекурсии
        2.2. Продемонстрировать работу метода
     */
        System.out.println("Binary search");
        int elementToSearch1 = 88;
        int index1= linearSearch(new int[]{00,11,22,33,44,55,66,77,88,99}, elementToSearch);

        print1(elementToSearch1, index1);
        System.out.println(elementToSearch1);


    }



}
