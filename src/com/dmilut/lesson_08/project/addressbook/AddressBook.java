package com.dmilut.lesson_08.project.addressbook;

import com.dmilut.lesson_08.project.addressbook.entity.Address;
import com.dmilut.lesson_08.project.addressbook.entity.Contact;
import com.dmilut.lesson_08.project.addressbook.util.Util;

import java.io.IOException;

import static com.dmilut.lesson_08.project.addressbook.util.Util.inputText;

public class AddressBook {

    /*
     * NOTE : =====================================================================================================
     * Задача   -   написать программу, которая будет решать проблему из реальной жизни.
     * Level 3  -   провести анализ предметной области
     *          -   записать сущности предметной области как классы программы
     *          -   записать поля классов
     * ============================================================================================================
     */

    public static void main(String[] args) throws IOException {

        new Util().initApp();


        System.out.println("Введите контакт:");

        Contact contact = new Contact();
        Address address = new Address();

        System.out.println("Введите имя:");
        contact.firstName = inputText();

        System.out.println("Введите фамилию:");
        contact.lastName = inputText();

        System.out.println("Введите номер телефона:");
        contact.phoneNumber = Long.parseLong(inputText());

        System.out.println("Ввод адреса:");

        System.out.println("Введите номер дома:");
        address.houseNumber = inputText();

        System.out.println("Введите улицу:");
        address.streetName = inputText();

        System.out.println("Введите город:");
        address.cityName = inputText();

        System.out.println("Введите штат:");
        address.stateName = inputText();

        System.out.println("Введите зип-код:");
        address.zipCode = Integer.parseInt(inputText());

        contact.address = address;

        System.out.println("Вы записали контакт:");
        System.out.println("Имя: " + contact.firstName);
        System.out.println("Фамилия: " + contact.lastName);
        System.out.println("Номер телефона: " + contact.phoneNumber);
        System.out.println("Адрес контакта --------------------------------");
        System.out.println("Номер дома: " + address.houseNumber);
        System.out.println("Улица: " + contact.address.streetName);
        System.out.println("Город: " + contact.address.cityName);
        System.out.println("Штат: " + contact.address.stateName);
        System.out.println("Зип код: " + contact.address.zipCode);

    }

}



