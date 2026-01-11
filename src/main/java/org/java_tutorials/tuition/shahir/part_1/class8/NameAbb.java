package org.java_tutorials.tuition.shahir.part_1.class8;

import java.util.Scanner;

public class NameAbb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = "Abdul basit khan";
        name=name.trim();
        String l, m, w;
        l = "" + name.charAt(0);
        m = "" + name.charAt(name.indexOf(' ') + 1);
        w = name.substring(name.lastIndexOf(' ') + 1);
        System.out.println(l + "." + m + "." + w);
    }
}
