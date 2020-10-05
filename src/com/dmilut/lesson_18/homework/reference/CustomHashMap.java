package com.dmilut.lesson_18.homework.reference;

import java.util.HashSet;
import java.util.LinkedList;

/* TODO: 9/24/20
    1.1. Реализовать собственный вариант ассоциативного массива с методами put, get, remove */
public class CustomHashMap {
    private final int ARRAY_LENGTH = 1024;
    private LinkedList[] array = new LinkedList[ARRAY_LENGTH];

    public Object get(String key) {
        if (key == null) {
            return null;
        }

        int index = hash(key);
        LinkedList<Entry> items = array[index];

        if (items == null) {
            return null;
        } else {
            for (Entry item : items) {
                if (item.getKey().equals(key)) {
                    return item.getValue();
                }
            }
        }

        return null;
    }

    public void put(String key, Object value) {
        int index = hash(key);
        LinkedList<Entry> entries = array[index];

        if (entries == null) {
            entries = new LinkedList<>();

            Entry entry = new Entry();
            entry.setKey(key);
            entry.setValue(value);

            entries.add(entry);

            array[index] = entries;
        } else {
            for (Entry entry : entries) {
                if (entry.getKey().equals(key)) {
                    entry.setValue(value);
                    return;
                }
            }

            Entry entry = new Entry();
            entry.setKey(key);
            entry.setValue(value);

            entries.add(entry);
        }
    }

    public void remove(String key) {
        int index = hash(key);
        LinkedList<Entry> items = array[index];

        if (items == null) {
            return;
        }

        for (Entry item : items) {
            if (item.getKey().equals(key)) {
                items.remove(item);
                return;
            }
        }
    }

    public HashSet<String> keySet() {
        HashSet<String> set = new HashSet<>();
        LinkedList<Entry> list;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                list = array[i];

                for (Entry entry : list) {
                    if (entry != null) {
                        set.add(entry.getKey());
                    }
                }
            }

        }

        return set;
    }

    private int hash(String key) {
        char[] array = key.toCharArray();
        int sum = 0;

        for (char c : array) {
            sum = sum + c;
        }

        //System.out.println("hash= " + (sum % ARRAY_LENGTH));
        return sum % ARRAY_LENGTH;
    }
}

