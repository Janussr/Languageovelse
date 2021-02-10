package com.company;

/**
 * CREATED BY Janus @ 2021-02-10 - 11:40
 **/
public class Arabic implements Dialog{


    private String s = "Arabic";
@Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "اضغط q للتوقف";
    }

    @Override
    public String selectedLanguage() {
        return "اللغة المختارة هي";
    }
}
