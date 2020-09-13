package com.dmilut.lesson_13.homework.homeworkOlha;

public class HomeworkOlha {
    public static void main(String[] args) {
    }
}


         //Easy level
    /* TODO: 9/7/20
        1.1. Написать метод реализующий алгоритм линейного поиска без использования циклов
        1.2. Продемонстрировать работу метода
     */

class LinearSearch {

    public static int linearSearch(int array[], int key){

        int size = array.length;
        //to search through array step by step
        for(int i=0;i<size;i++){
            if(array[i] == key){
                return i;
            }
        }
        //if element does not exist
        return -1;
    }

    public static void main(String a[]){

        int[] array= {220,110,405,355,234,145,354,960};

        int searchKey = 960;

        int result = linearSearch(array, searchKey);

        if (result == -1)
            System.out.println("Element does not exist!");

        else
            System.out.println("Key "+searchKey+" found at index: "+result);


    }
}



// Middle level
    /* TODO: 9/7/20
        2.1. Написать метод реализующий алгоритм бинарного поиска с использованием рекурсии
        2.2. Продемонстрировать работу метода
     */

class BinarySearch{
    public static int binarySearch(int arr[], int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;

            //returns element if it located in the middle of array
            if (arr[mid] == key){
                return mid;
            }

            //if element is smaller than mid, it could be placed in left sub array
            if (arr[mid] > key){
                return binarySearch(arr, first, mid-1, key);

            //else element can only exist in right sub array
            }else{
                return binarySearch(arr, mid+1, last, key);
            }
        }
        //if element does not exist
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {5,10,15,20,25,30,35,40,45,50,55};
        int key = 15;
        int last = arr.length-1;
        int result = binarySearch(arr,0,last,key);
        if (result == -1)
            System.out.println("Element does not exist!");
        else
            System.out.println("Element found at index: "+result);
    }
}


