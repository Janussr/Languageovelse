package com.company;

import java.util.HashMap;
import java.util.Map;

public class Sprog  {

    private HashMap<String, Dialog> dialoger = new HashMap<>();

    public Sprog() {


        // her tilføjer du ny sprog
        dialoger.put("da", new Dansk());
        dialoger.put("eng", new English());
        dialoger.put("swe", new Svensk());
        dialoger.put("de", new Tysk());
        dialoger.put("fr", new French());


    }
    public Dialog SkiftSprog(String s) {

       return dialoger.getOrDefault(s, new English());

    }
    public String getAllLanguage(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sprog til rådighed ");
        for (Map.Entry<String, Dialog> stringDialogEntry : dialoger.entrySet()) {
            stringBuilder.append(stringDialogEntry.getKey()+"/");
        }

        return stringBuilder.toString();
    }
}
