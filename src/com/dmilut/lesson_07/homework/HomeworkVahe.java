package com.dmilut.lesson_07.homework;
import com.dmilut.lesson_07.homework.Vahe.Fish;

import java.lang.reflect.Array;

public class HomeworkVahe {

    /* TODO: 8/17/20
        3.1. Создать static метод, который будет сравнивать размер двух рыб и выводить в консоль название
        большей рыбы */

    public static String biggerFish(Fish fish1, Fish fish2){
        if(fish1.getSize()> fish2.getSize()){
            return fish1.getName();
        }
        return fish2.getName();
    }

    public static void main(String[] args) {
        /* TODO: 8/17/20
            2.1. Создать экземпляр класса Fish используя пустой конструктор
            2.2. Создать экземпляр класса Fish используя конструктор для инициализации полей */

        //2.1
        Fish salmon = new Fish();

        //2.2
        Fish tuna = new Fish("tuna",3, "blue", true);

        //  Hard level
        /* TODO: 8/17/20
            4.1. Создать массив Fish
            4.2. Заполнить массив 5 произвольными объектами Fish с инициализированными полями
            4.3. Создать static метод, который будет искать самую большую рыбу и выводить в консоль текст вида "Эта рыба
             вот такого размера ..."
            4.4. Создать static метод, который будет проверять съедобна эта рыба или нет и выводить в консоль "И ее
             можно съесть!" или "Но ее нельзя съесть!" */
       //4.1
       Fish[] shoal= new Fish[5];
       Fish newFish;

       //4.2
       for (int i=0;i<5;i++){
           boolean edible = false;
           if (i%2 == 0){
               edible = true;
           }
           newFish = new Fish("Fish" + Integer.toString(i), i, "blue", edible);
       }

    }
}
