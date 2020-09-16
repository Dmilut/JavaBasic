package com.dmilut.lesson_14.homework.homeworkIryna;

public class HomeworkIryna {
    public static void main(String[] args) {

    int[]arr={10, 20,30,40,50,60,70,80,90,100};

    }

         /* TODO: 9/10/20
        1.1. Реализовать сортировку выбором с помощью рекурсии */

    public static void RecursionSelect(int[] arr, int length)
    {
        if(length==1)
            return;
        int max = 100;
        int tmp;
        int index = 0;
        for(int i = 0;i<length-1;i++ )
        {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        if(max>arr[length-1])
        {
            tmp = arr[length-1];
            arr[length - 1] = arr[index];
            arr[index] = tmp;
        }
        RecursionSelect(arr, length-1);
    }



}







