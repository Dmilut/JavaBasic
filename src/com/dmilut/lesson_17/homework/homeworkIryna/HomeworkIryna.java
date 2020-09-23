package com.dmilut.lesson_17.homework.homeworkIryna;

import java.util.Random;

public class HomeworkIryna {

     /* TODO: 9/21/20
        1.1. Провести отладку (дебагинг) метода quickSort из класса Lesson. Детально разобраться как он работает */


    public static class QuickSort
    {
        public static int x = 10;
        public static int[] sequence = new int[x];

        public static void quickSort(int left, int right)
        {
            if (right - left <= 0)
                return;
            else
            {
                Random rand = new Random();
                int pivotIndex = left + rand.nextInt(right - left + 1);
                swap(pivotIndex, right);

                int pivot = sequence[right];
                int partition = division(left, right, pivot);
                quickSort(left, partition - 1);
                quickSort(partition + 1, right);
            }
        }


        /* TODO: 9/21/20
       2.1. Используя подход "разделяй и властвуй" написать метод для поиска произвольного числа в массиве */


        public static int division(int left, int right, long pivot)
        {
            int leftPtr = left - 1;
            int rightPtr = right;
            while (true)
            {
                while (sequence[++leftPtr] < pivot)
                    ;
                while (rightPtr > 0 && sequence[--rightPtr] > pivot)
                    ;

                if (leftPtr >= rightPtr)
                    break;
                else
                    swap(leftPtr, rightPtr);
            }
            swap(leftPtr, right);
            return leftPtr;
        }

        public static void swap(int dex1, int dex2)
        {
            int temp = sequence[dex1];
            sequence[dex1] = sequence[dex2];
            sequence[dex2] = temp;
        }

        static void printArray(int[] sorted_sequence)
        {
            for (int i = 0; i < sorted_sequence.length; i++)
                System.out.print(sorted_sequence[i] + " ");
        }
        public static void main(String args[])
        {
            Random random = new Random();

            for (int i = 0; i < x; i++)
                sequence[i] = Math.abs(random.nextInt(25));
            printArray(sequence);
            quickSort(0, x- 1);
            printArray(sequence);
        }
    }


}







