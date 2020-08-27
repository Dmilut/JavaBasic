package com.dmilut.lesson_10.project.addressbook.service;

<<<<<<< HEAD
import com.dmilut.lesson_10.project.addressbook.entity.Address;
=======
>>>>>>> 5a25157... AddressBook 10 init commit
import com.dmilut.lesson_10.project.addressbook.entity.Contact;

import java.io.IOException;

import static com.dmilut.lesson_08.project.addressbook.util.Util.inputText;

public class ContactService {
    private StorageService storageService = new StorageService();

<<<<<<< HEAD
    public void createContact(String firstName, String lastName, long phoneNumber, Address address) {
        Contact contact = new Contact(firstName, lastName, phoneNumber, address);
=======
    public void createContact(String firstName, String lastName, long phoneNumber) {
        Contact contact = new Contact();
        contact.firstName = firstName;
        contact.lastName = lastName;
        contact.phoneNumber = phoneNumber;
>>>>>>> 5a25157... AddressBook 10 init commit

        saveContact(contact);
    }

    public void saveContact(Contact contact) {
        storageService.saveContact(contact);
    }

    public Contact getContactByFirstName(String firstName) {
<<<<<<< HEAD

        return storageService.getByFirstName(firstName);
=======
        Contact contact = storageService.getByFirstName(firstName);

        return contact;
>>>>>>> 5a25157... AddressBook 10 init commit
    }

    public Contact[] getAllContacts() {
        return storageService.getAllContact();
    }

    public void updateContact(Contact contact) {

        storageService.updateContact(contact);
    }

    public void deleteContact(Contact contact) {

        storageService.deleteContact(contact);
    }

    public void inputContact() throws IOException {
<<<<<<< HEAD

        System.out.println("Введите имя             ");
        String firstName = inputText();

        System.out.println("Введите фамилию         ");
        String lastName = inputText();

        System.out.println("Введите номер телефона  ");
        long phoneNumber = Long.parseLong(inputText());

        System.out.println("Адрес-------------------");
        System.out.println("Введите номер дома      ");
        String houseNumber = inputText();

        System.out.println("Введите улицу           ");
        String streetName = inputText();

        System.out.println("Введите город           ");
        String cityName = inputText();

        System.out.println("Введите штат            ");
        String stateName = inputText();

        System.out.println("Введите зип-код         ");
        int zipCode = Integer.parseInt(inputText());

        Contact contact = new Contact(firstName, lastName, phoneNumber, new Address(houseNumber, streetName, cityName, stateName, zipCode));
=======
        Contact contact = new Contact();
        System.out.println("Введите имя             ");
        contact.firstName = inputText();

        System.out.println("Введите фамилию         ");
        contact.lastName = inputText();

        System.out.println("Введите номер телефона  ");
        contact.phoneNumber = Long.parseLong(inputText());
>>>>>>> 5a25157... AddressBook 10 init commit

        saveContact(contact);
    }

    public void printContact(Contact contact) {
        System.out.println("=========================================================================================");
<<<<<<< HEAD
        System.out.println("Имя                     " + contact.getFirstName());
        System.out.println("Фамилия                 " + contact.getLastName());
        System.out.println("Номер телефона          " + contact.getPhoneNumber());
        System.out.println("Адрес ===================================================================================");
        System.out.println("Номер дома              " + contact.getAddress().getHouseNumber());
        System.out.println("Улица                   " + contact.getAddress().getStreetName());
        System.out.println("Город                   " + contact.getAddress().getCityName());
        System.out.println("Штат                    " + contact.getAddress().getStateName());
        System.out.println("Зип-код                 " + contact.getAddress().getZipCode());
=======
        System.out.println("Имя                     " + contact.firstName);
        System.out.println("Фамилия                 " + contact.lastName);
        System.out.println("Номер телефона          " + contact.phoneNumber);
>>>>>>> 5a25157... AddressBook 10 init commit
        System.out.println("=========================================================================================");
    }

    public void printContacts(Contact[] contacts) {
        for (Contact contact : contacts) {
            if (contact != null) {
                printContact(contact);
            }
        }
    }
}
