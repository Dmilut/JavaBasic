package com.dmilut.lesson_14.project.addressbook;

import com.dmilut.lesson_14.project.addressbook.service.ContactService;
import com.dmilut.lesson_14.project.addressbook.util.Util;

import java.io.IOException;

import static com.dmilut.lesson_14.project.addressbook.util.Util.inputText;


public class AddressBook {

    private static ContactService contactService = new ContactService();
    private static Util util = new Util();

    /* TODO: 9/9/20
        1. Заменить реализацию Storage с массива на ArrayList
        2. Рефакторинг
        3. Добавить комментарии
     */

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
            System.out.println("search by first name    - поиск по имени контакта =======================================");
            System.out.println("search by last name     - поиск по фамилии контакта =====================================");
            System.out.println("search by city          - поиск по городу ===============================================");
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

                case "search by first name": {
                    System.out.println("Введите имя");
                    String firstName = inputText();

                    contactService.printContact(contactService.getContactByFirstName(firstName));
                }
                break;

                case "search by last name": {
                    System.out.println("Введите фамилию");
                    String lastName = inputText();

                    contactService.printContact(contactService.getContactByLastName(lastName));
                }
                break;

                case "search by city": {
                    System.out.println("Введите город");
                    String cityName = inputText();

                    contactService.printContact(contactService.getContactByCityName(cityName));
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



