package com.dmilut.lesson_08.project.addressbook.service;

import com.dmilut.lesson_08.project.addressbook.entity.Contact;

public class ContactService {
    private StorageService storageService = new StorageService();

    public void createContact(String firstName, String lastName, long phoneNumber) {
        Contact contact = new Contact();
        contact.firstName = firstName;
        contact.lastName = lastName;
        contact.phoneNumber = phoneNumber;


        storageService.saveContact(contact);
    }

    public Contact getContactByFirstName(String firstName) {
        Contact contact = storageService.getByFirstName(firstName);

        return contact;
    }

    public void updateContact(Contact contact) {

        storageService.updateContact(contact);
    }

    public void deleteContact(Contact contact) {

        storageService.deleteContact(contact);
    }

    public void printContact(Contact contact) {
        System.out.println("Имя             " + contact.firstName);
        System.out.println("Фамилия         " + contact.lastName);
        System.out.println("Номер телефона  " + contact.phoneNumber);
    }
}
