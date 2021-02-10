package com.company;

public class French implements Dialog{

    private String s = "French";

    @Override
    public String getLanguage() {
        return null;
    }

    @Override
    public String quit() {
        return "appuyez sur q pour quitter ";
    }

    @Override
    public String selectedLanguage() { return "la langue sélectionnée est ";
    }
}
