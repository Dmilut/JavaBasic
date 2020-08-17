package com.dmilut.lesson_06.project.addressbook.service;

import com.dmilut.lesson_06.project.addressbook.entity.Contact;
import com.dmilut.lesson_06.project.addressbook.util.Storage;

public class ContactService {
    StorageService storageService = new StorageService();

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
}
