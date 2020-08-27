package com.dmilut.lesson_10.project.addressbook.service;

import com.dmilut.lesson_10.project.addressbook.entity.Contact;

import java.io.IOException;

import static com.dmilut.lesson_08.project.addressbook.util.Util.inputText;

public class ContactService {
    private StorageService storageService = new StorageService();

    public void createContact(String firstName, String lastName, long phoneNumber) {
        Contact contact = new Contact(firstName, lastName, phoneNumber);

        saveContact(contact);
    }

    public void saveContact(Contact contact) {
        storageService.saveContact(contact);
    }

    public Contact getContactByFirstName(String firstName) {
        Contact contact = storageService.getByFirstName(firstName);

        return contact;
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

        System.out.println("Введите имя             ");
        String firstName = inputText();

        System.out.println("Введите фамилию         ");
        String lastName = inputText();

        System.out.println("Введите номер телефона  ");
        Long phoneNumber = Long.parseLong(inputText());

        Contact contact = new Contact(firstName, lastName, phoneNumber);

        saveContact(contact);
    }

    public void printContact(Contact contact) {
        System.out.println("=========================================================================================");
        System.out.println("Имя                     " + contact.getFirstName());
        System.out.println("Фамилия                 " + contact.getLastName());
        System.out.println("Номер телефона          " + contact.getPhoneNumber());
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
