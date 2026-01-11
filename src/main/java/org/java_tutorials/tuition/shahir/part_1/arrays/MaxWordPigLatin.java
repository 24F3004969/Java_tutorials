package org.java_tutorials.tuition.shahir.part_1.arrays;

import java.util.Scanner;

public class MaxWordPigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sen = in.nextLine();
        String maxWord = "";
        String word = "";
        int volIndex = -1;
        for (int i = 0; i < sen.length(); i++) {
            char c = sen.charAt(i);
            if (c != ' ') {
                word += c;
                c = Character.toUpperCase(c);
                if (volIndex < 0 && (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                    volIndex = i;
                }
            } else {
                if (word.length() > maxWord.length())
                    maxWord = word;
                word="";
            }
        }
        System.out.println(maxWord);
        System.out.println("PigLatin form : " + maxWord.substring(volIndex) + maxWord.substring(0, volIndex) + "ay");
    }
}
