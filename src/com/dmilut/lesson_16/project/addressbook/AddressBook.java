package com.dmilut.lesson_16.project.addressbook;

import com.dmilut.lesson_16.project.addressbook.service.ContactService;
import com.dmilut.lesson_16.project.addressbook.util.Util;

import java.io.IOException;

import static com.dmilut.lesson_16.project.addressbook.util.Util.inputText;


public class AddressBook {

    private static ContactService contactService = new ContactService();
    private static Util util = new Util();

    /* TODO: 9/16/20
        1. Реализовать метод поиска по first name, last name и city в одном методе (сейчас сделаны 3 метода по одному
        на каждый тип поиска - нужно объеденить все в один. */
    public static void main(String[] args) throws IOException {

        util.initApp();

        System.out.println("=========================================================================================");
        System.out.println("                        Добро пожаловать в адресную книгу                                ");
        System.out.println("=========================================================================================");

        String command = "continue";

        while (!command.equals("exit")) {

            System.out.println("Подсказка по коммандам ==================================================================");
            System.out.println("enter contact           - ввод нового контакта ==========================================");
            System.out.println("print contacts          - вывод в консоль всех контактов ================================");
            System.out.println("search                  - поиск контакта ================================================");
            System.out.println("delete by first name    - удаление контакта =============================================");
            System.out.println("exit                    - выход из программы ============================================");
            System.out.println("=========================================================================================");
            System.out.println("Введите комманду");

            command = inputText();

            switch (command) {
                case "enter contact": {
                    contactService.inputContact();
                }
                break;

                case "print contacts": {
                    contactService.printContacts(contactService.getAllContacts());
                }
                break;

                case "search": {
                    System.out.println("Введите имя / фамилию / город");
                    String searchQuery = inputText();

                    contactService.printContact(contactService.searchByFirstNameOrLastNameOrCityName(searchQuery));
                }
                break;

                case "delete by first name": {
                    System.out.println("Введите имя");
                    String firstName = inputText();

                    contactService.deleteContactByFirstName(firstName);
                }
                break;

                case "exit": {
                    command = "exit";
                }
                break;

                default: {
                    System.out.println("Вы ошиблись!!!");
                    command = "continue";
                }
            }

        }
    }
}



