package com.dmilut.lesson_12.project.addressbook;

import com.dmilut.lesson_12.project.addressbook.entity.Contact;
import com.dmilut.lesson_12.project.addressbook.service.ContactService;
import com.dmilut.lesson_12.project.addressbook.util.Util;

import java.io.IOException;

import static com.dmilut.lesson_08.project.addressbook.util.Util.inputText;

public class AddressBook {

    private static ContactService contactService = new ContactService();
    private static Util util = new Util();

    /* TODO: 9/2/20
        Добавить в проект метод delete contact
        Добавить в проект метод search by last name
        Добавить в проект метод search by city name
        Добавить в проект метод print all contacts names, который выводит в консоль только имена и фамилии всех контактов
     */

    public static void main(String[] args) throws IOException {

        util.initApp();

        System.out.println("=========================================================================================");
        System.out.println("                        Добро пожаловать в адресную книгу                                ");
        System.out.println("=========================================================================================");

        String command = "start";

        while (command.equals("start") || command.equals("continue")) {

            System.out.println("Подсказка по коммандам ==================================================================");
            System.out.println("enter contact           - ввод нового контакта ==========================================");
            System.out.println("print contacts          - вывод в консоль всех контактов ================================");
            System.out.println("search by name          - поиск по имени контакта =======================================");
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
                case "search by name": {
                    System.out.println("Введите имя");
                    String name = inputText();
                    Contact contact = contactService.getContactByFirstName(name);

                    contactService.printContact(contact);
                }
                break;
                default: {
                    System.out.println("Вы ошиблись!!!");
                }
            }

            System.out.println('\n' + "Для продолжения введите continue");
            command = inputText();
        }
    }
}



