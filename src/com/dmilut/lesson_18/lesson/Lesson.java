package com.dmilut.lesson_18.lesson;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Lesson {

    public static void main(String[] args) {

        State washington = new State("Washington", "WA", "Olympia");
        State arizona = new State("Arizona", "AZ", "Phoenix");

        HashMap<String, State> stateMap = new HashMap<>();
        Hashtable<String, State> hashtable = new Hashtable<>();

        stateMap.put(washington.getShortName(), washington);
        stateMap.put(arizona.getShortName(), arizona);

        Iterator<String> iterator = stateMap.keySet().iterator();

        while (iterator.hasNext()) {
            String shortName = iterator.next();
            State state = stateMap.get(shortName);

            System.out.println(state.getCapitalName());
        }

    }

}
