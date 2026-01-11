package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Enter a String ");
        s = in.nextLine();
        int l = s.length();
        int count = 0;
        s=s.toLowerCase();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        System.out.println(count);
    }
}
