package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class StringQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Enter a String ");
        s = in.nextLine();
        int l = s.length();
        String s1 = "";
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            s1 = c + s1;
        }
        System.out.println(s1);
    }
}
