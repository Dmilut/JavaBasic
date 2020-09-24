package com.dmilut.lesson_18.lesson;

import java.util.Objects;

public class State {

    private String fullName;
    private String shortName;
    private String capitalName;

    public State(String fullName, String shortName, String capitalName) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.capitalName = capitalName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State)) return false;
        State state = (State) o;
        return getFullName().equals(state.getFullName()) &&
                getShortName().equals(state.getShortName()) &&
                getCapitalName().equals(state.getCapitalName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getShortName(), getCapitalName());
    }
}
