package org.java_tutorials.dsa.util;

public class CountryFlag {
    public static void main(String[] args) {
        System.out.println(countryCodeToEmoji("US"));
    }
    public static String countryCodeToEmoji(String code) {

        // offset between uppercase ASCII and regional indicator symbols
        int OFFSET = 127397;

        // validate code
        if(code == null || code.length() != 2) {
            return "";
        }

        //fix for uk -> gb
        if (code.equalsIgnoreCase("uk")) {
            code = "gb";
        }

        // convert code to uppercase
        code = code.toUpperCase();

        StringBuilder emojiStr = new StringBuilder();

        //loop all characters
        for (int i = 0; i < code.length(); i++) {
            emojiStr.appendCodePoint(code.charAt(i) + OFFSET);
        }

        // return emoji
        return emojiStr.toString();
    }
}
