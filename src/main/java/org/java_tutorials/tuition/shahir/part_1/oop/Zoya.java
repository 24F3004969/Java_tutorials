package org.java_tutorials.tuition.shahir.part_1.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Zoya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a three words name");
        String s;
        String f, m;
        String l;
        System.out.println();
        s = in.nextLine();
        f = s.substring(0, s.indexOf(' '));
        m = s.substring(s.indexOf(' ') + 1, s.lastIndexOf(' '));
        l = s.substring(s.lastIndexOf(' ') + 1);
        System.out.println(f.charAt(0) + "." + m.charAt(0) + "." + l);
    }
}
