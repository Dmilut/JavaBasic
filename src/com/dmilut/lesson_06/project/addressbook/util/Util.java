package com.dmilut.lesson_06.project.addressbook.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

    public static String inputText() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        return text;
    }
}
