package com.company;

public class Svensk implements Dialog{
    private String s = "swedishhzz.";


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
