package com.dmilut.lesson_14.homework.homeworkVahe;

public class HomeworkVahe {

    public static void main(String[] args) {

    /* TODO: 9/10/20
        1.1. Реализовать сортировку выбором с помощью рекурсии */

        int[] sortingArray = {18, 9, 4, 7, 0, 15, 1, 28, 16, 35};

        sort(sortingArray);

        System.out.println("Sorted Array is : ");

        for (int i = 0; i < sortingArray.length; i++) {

            System.out.print(sortingArray[i] + " ");
        }

        // 2.1. Test custom Array List
        VahesArrayList<Integer> list = new VahesArrayList<>();
        System.out.println();
        System.out.println("Testing custom Array List");
        list.add(0, 1);
        System.out.println(list.get(0));
        list.set(0, 4);
        System.out.println(list.get(0));
        list.remove(Integer.valueOf(4));
        System.out.println(list.size());

        // 3.1. Test custom Linked List
        VahesLinkedList<String> linkedList = new VahesLinkedList<>();
        System.out.println();
        System.out.println("Testing custom Linked List");
        linkedList.add(0, "test");
        System.out.println(linkedList.get(0));
        linkedList.set(0, "not test");
        System.out.println(linkedList.get(0));
        linkedList.remove("not test");
        System.out.println(list.size());
    }

    public static void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high){
            int indexOfMin = low;
            int min = array[low];

            for (int i = low + 1; i <= high; i++){
                if (array[i] < min) {
                    min = array[i];
                    indexOfMin = i;
                }
            }

            array[indexOfMin] = array[low];
            array[low] = min;

            sort(array, low + 1, high);
        }
    }
}




