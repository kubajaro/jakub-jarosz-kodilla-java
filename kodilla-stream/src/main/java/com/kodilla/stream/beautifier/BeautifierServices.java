package com.kodilla.stream.beautifier;

import java.util.Locale;

public class BeautifierServices {
    public static String firstAndLastLetterUpperCase(String text){
        int textLength = text.length();
        return text.substring(0,1).toUpperCase()+text.substring(1,textLength-1).toLowerCase()+
                text.substring(textLength-1).toUpperCase();
    }

    public static String textAsQuote(String text){
        return "'" + text + "'";
    }
}
