package com.dmilut.lesson_09.homework.homeworkIryna;

 /* TODO: 8/24/20
        6.1. Реализовать класс AnimalManager
        6.2. Реализовать методы в котором кошки и собаки будут сортироваться в зависимости от возраста на 2 категории:
         щенки (котята) и взрослые особи
        6.3. Реализовать методы в котором кошки и собаки будут складываться в массивы puppies, kittens, dogs, cats
        в зависимости от результата работы методов из п. 6.3. */


public class AnimalManager {

    public void  puppies() {
        int age;
        for(age=0;age<=2;age++ ){
            System.out.println("The dog less or equal 2 is puppy");
        }
    }

    public void adultDogs() {
        int age;
        for(age=20;age>2;age-- ){
            System.out.println("The dog older than 2 is adultDog");
        }
    }

    public void kittens() {
        int age;
        for(age=0;age<=2;age++ ){
            System.out.println("The cat less or equal 2 is puppy");
        }
    }

    public void adultCats() {
        int age;
        for(age=20;age>2;age-- ){
            System.out.println("The cat older than 2 is adultCat");
        }
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


