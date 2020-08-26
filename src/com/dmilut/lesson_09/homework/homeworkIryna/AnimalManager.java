package com.dmilut.lesson_09.homework.homeworkIryna;

 /* TODO: 8/24/20
        6.1. Реализовать класс AnimalManager
        6.2. Реализовать методы в котором кошки и собаки будут сортироваться в зависимости от возраста на 2 категории:
         щенки (котята) и взрослые особи
        6.3. Реализовать методы в котором кошки и собаки будут складываться в массивы puppies, kittens, dogs, cats
        в зависимости от результата работы методов из п. 6.3. */

import java.util.Objects;

public class AnimalManager<kittenFood> {
    public void puppies() {
    }

    public void adultDogs() {
    }

    public void kittens() {
    }

    public void adultCats() {
    }

    String[] adultDogs;
    String[] adultCats;
    String[] puppies;
    String[] kittens;


     /* TODO: 8/24/20
        7.1. Творческое задание. Реализовать метод selectionOfFood в классе AnimalManager в котором животное будет
        проверяться на наличие в массивах puppies, kittens, dogs, cats и в зависимости от того, щенок (котенок) это
        или взрослая особь, будет предлагаться соответствующее питание. */

    String puppyFood = null;
    String adultDogFood = null;
    String kittenFood = null;
    String adultCatFood = null;
    boolean equals;

    public void puppyFood() {

        if (puppies.equals(puppyFood)) {
            equals = true;
        } else equals = false;
    }

    public void kittenFood() {
        if (kittens.equals(kittenFood)) {
            equals = true;
        } else equals = false;
    }

    public void adultDogFood() {
        if (adultCats.equals(adultCatFood)) {
            equals = true;
        } else equals = false;
    }

    public void AdultCatFood() {
        if (adultDogs.equals(adultDogFood)) {
            equals = true;
        } else equals = false;
    }
}


