package com.dmilut.lesson_06.project.addressbook.util;

import com.dmilut.lesson_06.project.addressbook.entity.Contact;
import com.dmilut.lesson_06.project.addressbook.service.ContactService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

    public static void initApp() {


    }

    public static String inputText() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        return text;
    }
}
