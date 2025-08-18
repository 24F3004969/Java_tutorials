package org.java_tutorials.function;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        int l = word.length();
        int count = 0;
        String no_vowel_word = "";
        word = word.toLowerCase();
        for (int i = 0; i < l; i++) {
            char c = word.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                no_vowel_word = no_vowel_word + c;
            }
        }
        System.out.println(no_vowel_word);
        /*
        apple
        baeic
         */
    }
}
