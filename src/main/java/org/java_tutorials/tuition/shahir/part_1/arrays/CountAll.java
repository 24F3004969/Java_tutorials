package org.java_tutorials.tuition.shahir.part_1.arrays;

import java.util.Scanner;

public class CountAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sen = in.nextLine();
        sen=sen+" ";
        String word = "";
        System.out.println("Word\t\t\tVowel\t\t\tConsonant\t\t\tReverse\t\t\tLength");
        for (int i = 0; i < sen.length(); i++) {
            char c = sen.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                int vCount = 0, CCount = 0;
                String R_word = "";
                for (int j = 0; j < word.length(); j++) {
                    char ch = word.charAt(j);
                    R_word = ch + R_word;
                    char t = Character.toUpperCase(ch);
                    if (t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U')
                        vCount++;
                    else if (t != ' ')
                        CCount++;
                }
                System.out.println(word + "\t\t\t" + vCount + "\t\t\t" + CCount + "\t\t\t" + R_word + "\t\t\t" + word.length());
                word = "";
            }
        }
    }
}
