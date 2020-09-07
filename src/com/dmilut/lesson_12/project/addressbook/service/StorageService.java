package com.dmilut.lesson_12.project.addressbook.service;

import com.dmilut.lesson_12.project.addressbook.entity.Contact;
import com.dmilut.lesson_12.project.addressbook.util.Storage;

public class StorageService {

    public void saveContact(Contact contact) {
        int emptySlotIndex = getFirstEmptySlotIndex();

        Storage.contacts[emptySlotIndex] = contact;
    }

    public Contact[] getAllContact() {
        return Storage.contacts;
    }

    public Contact getByFirstName(String firstName) {
        Contact contact = Storage.contacts[getContactIndexByFirstName(firstName)];

        return contact;
    }

    public Contact getByLastName(String lastName) {
        Contact contact = Storage.contacts[getContactIndexByLastName(lastName)];

        return contact;
    }

    public Contact getByCityName(String cityName) {
        Contact contact = Storage.contacts[getContactIndexByCityName(cityName)];

        return contact;
    }

    public void updateContact(Contact contact) {
        int index = getContactIndexByFirstName(contact.getFirstName());

        Storage.contacts[index] = contact;
    }


    public void deleteContact(Contact contact) {
        int index = getContactIndexByFirstName(contact.getFirstName());

        Storage.contacts[index] = null;
    }

    private int getFirstEmptySlotIndex() {
        int index = 0;

        for (int i = 0; i < Storage.contacts.length; i++) {
            if (Storage.contacts[i] == null) {
                index = i;
                break;
            }
        }

        return index;
    }

    private int getContactIndexByFirstName(String firstName) {
        int index = 0;

        for (int i = 0; i < Storage.contacts.length; i++) {
            if (Storage.contacts[i].getFirstName().equals(firstName)) {
                index = i;
                break;
            }
        }

        return index;
    }

    private int getContactIndexByLastName(String lastName) {
        int index = 0;

        for (int i = 0; i < Storage.contacts.length; i++) {
            if (Storage.contacts[i].getLastName().equals(lastName)) {
                index = i;
                break;
            }
        }

        return index;
    }

    private int getContactIndexByCityName(String cityName) {
        int index = 0;

        for (int i = 0; i < Storage.contacts.length; i++) {
            if (Storage.contacts[i].getAddress().getCityName().equals(cityName)) {
                index = i;
                break;
            }
        }

        return index;
    }



}
