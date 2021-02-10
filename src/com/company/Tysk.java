package com.company;

/**
 * CREATED BY Janus @ 2021-02-10 - 11:05
 **/
public class Tysk implements Dialog {

    private String s = "Deutch";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Drücken Sie q, um zu stoppen";
    }

    @Override
    public String selectedLanguage() {
        return "Die ausgewählte Sprache ist";
    }
}
