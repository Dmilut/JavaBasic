package com.dmilut.lesson_16.homework.homeworkOlga;

public class HomeworkOlga {

    public static void main(String[] args) {
        int testArray[] = new int[]{2,9,35,25,15,3};
        sortDescending(testArray);
        sortRecursive(testArray,testArray.length);
    }
                /* TODO: 9/16/20
                1.1. Реализовать сортировку пузырьком по убыванию */
    private static void sortDescending(int[] testArray) {
        int n = testArray.length;
        int compare = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++) {
                if (testArray[j - 1] < testArray[j]) {
                 compare = testArray[j - 1];
                 testArray[j - 1] = testArray[j];
                 testArray[j] = compare;
                }
            }
        }
    }

                /* TODO: 9/16/20
                2.1. Реализовать сортировку пузырьком с помощью рекурсии */
     static void sortRecursive(int testArray[], int a) {

         if (a == 1)
          return;
           for (int i=0; i<a-1; i++)
               if (testArray[i] > testArray[i+1]) {
               int temp = testArray[i];
                   testArray[i] = testArray[i+1];
                   testArray[i+1] = temp;
               }
         sortRecursive(testArray, a-1);
         }

                /* TODO: 9/16/20
                3.1. Реализовать нахождение суммы чисел Фибоначчи заданного диапозона */
      static int fibonacciSum(int b) {
           if (b <= 0)
               return 0;
           int fibonacci[]=new int[b+1];
          fibonacci[0] = 0;
          fibonacci[1] = 1;

           int sum = fibonacci[0] + fibonacci[1];

           for (int i=2; i<=b; i++) {
               fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
               sum += fibonacci[i];
           }
           return sum;
      }
}












