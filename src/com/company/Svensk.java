package com.company;

public class Svensk implements Dialog{
    private String s = "swedish";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "tryck på q för att stoppa ";
    }

    @Override
    public String selectedLanguage() { return "det valda språket är "; }
}
