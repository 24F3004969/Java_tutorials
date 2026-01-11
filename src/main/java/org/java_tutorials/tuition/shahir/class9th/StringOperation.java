package org.java_tutorials.tuition.shahir.class9th;

import java.util.*;

abstract class StringOperations {
    public abstract String reverse(String s);

    public abstract int vowelCount(String s);
}

class UpdatedStrings extends StringOperations {
    @Override
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    @Override
    public int vowelCount(String s) {
        return s.length() - s.toLowerCase().replace("a", "").
                replace("e", "").replace("i", "").
                replace("o", "").replace("u", "").length();
    }
}

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        UpdatedStrings str = new UpdatedStrings();
        System.out.println("Reverse of " + s + " is " + str.reverse(s));
        System.out.println("Vowel count of " + s + " is " + str.vowelCount(s));
    }
}