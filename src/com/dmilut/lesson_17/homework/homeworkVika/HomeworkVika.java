package com.dmilut.lesson_17.homework.homeworkVika;

public class HomeworkVika {

    public static void main(String[] args) {

        /* TODO: 9/21/20
        2.1. Используя подход "разделяй и властвуй" написать метод для поиска произвольного числа в массиве */


        int[] array = {23,54,67,76,87};
        int search = 87;
        int start = 0;
        int end = array.length - 1;

        boolean togg = true;
        while(togg) {
            int mid = (start + end) / 2;

            if (array[mid] == search) {
                System.out.println(mid);
                break;
            } else if (array[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }



    }

    public static void quickSort(int[] source,int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker)/2];

        do{
            while (source[leftMarker] < pivot){ //Двигаем левый маркер слева-направо пока элемент меньше чем pivot
                leftMarker++;
            }
            while(source[rightMarker] > pivot) { //Двигаем правый маркер  пока элемент больше чем pivot
                rightMarker--;
            }
            // Прверяем не нужно ли обменять местами элементы на которые указывают маркеры

            if(leftMarker <= rightMarker) {

                if(leftMarker < rightMarker) {

                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                //Сдвигаем маркеры чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while(leftMarker <= rightMarker) ;

        if(leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if(leftBorder < rightMarker) {
            quickSort(source, leftBorder,rightMarker);
        }
    }

}










