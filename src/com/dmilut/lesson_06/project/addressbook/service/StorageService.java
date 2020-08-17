package com.dmilut.lesson_06.project.addressbook.service;

import com.dmilut.lesson_06.project.addressbook.util.Storage;
import com.dmilut.lesson_06.project.addressbook.entity.Contact;

public class StorageService {

    public void saveContact(Contact contact) {

    }

    public Contact[] getAllContact() {

        return new Storage().contacts;
    }

    public Contact getByFirstName() {

        return new Contact();
    }

    public void updateContact(Contact contact) {

    }


    public void deleteContact(Contact contact) {

    }
}
