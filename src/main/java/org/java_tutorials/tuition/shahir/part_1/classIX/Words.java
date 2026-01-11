package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s, s1 = "";
        s = in.nextLine();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char ch=s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                s1 = s1 + "😅";
            } else
                s1 = s1 + ch;
        }
        System.out.println(s);
        System.out.println(s1);
    }
}
