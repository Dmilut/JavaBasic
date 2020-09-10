package com.dmilut.lesson_13.homework.homeworkYulia;

public class HomeworkYulia {

    public static void main(String[] args) {

        int arr[] = {11, 12, 15, 16, 20, 43, 58, 75, 95};

        int searchValue = 75;

        //Linear recursion
        int index = recSearch(arr, 0, arr.length - 1, searchValue);
        if (index != -1) {
            System.out.println("Element " + searchValue + " was found in index " + index);
        } else {
            System.out.println("Sorry, element " + searchValue + " wasn't found");
        }


        //Binary recursion
        HomeworkYulia binaryRecursion = new HomeworkYulia();
        int length = arr.length;
        int result = binaryRecursion.recursionBinary(arr, 0, length - 1, searchValue);
        if (result == -1) {
            System.out.println("Sorry, element" + searchValue + "wasn't found");
        } else {
            System.out.println("Element" + searchValue + "was found at index" + result);
        }

    }

    //Linear search with recursion
    static int recSearch(int arr[], int left, int right, int searchValue) {
        if (right < 1)
            return -1;
        if (arr[left] == searchValue)
            return left;
        if (arr[right] == searchValue)
            return right;
        return recSearch(arr, left + 1, right - 1, searchValue);
    }

    //Binary search with recursion
    int recursionBinary(int arr[], int left, int right, int searchValue) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == searchValue)
                return mid;
            if (arr[mid] > searchValue)
                return recursionBinary(arr, left, mid - 1, searchValue);
            return recursionBinary(arr, mid + 1, right, searchValue);
        }
        return -1;
    }
}