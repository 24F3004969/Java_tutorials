package org.java_tutorials.tuition.shahir.part_1.class8;

import java.util.Scanner;

public class StRINGQuestion {
    public static void main(String[] args) {
        String s = "Java";
        String t = "Bluej";

        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.concat(t));
        System.out.println(s.lastIndexOf('v') + s.indexOf('g'));
        System.out.println(s.startsWith("Ja"));
        System.out.println(s.replace('v','g'));
        System.out.println(s.replace("Java","Kotlin"));
        System.out.println(t.substring(1,4));
    }
}
