package com.dmilut.lesson_08.project.addressbook.util;

import com.dmilut.lesson_08.project.addressbook.service.ContactService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

    private ContactService contactService = new ContactService();

    public void initApp() {
        contactService.createContact("TestName1", "TestLast1", 1234567890L);
        contactService.createContact("TestName2", "TestLast2", 2345678901L);
        contactService.createContact("TestName3", "TestLast3", 3456789012L);

    }

    public static String inputText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        return text;
    }
}
