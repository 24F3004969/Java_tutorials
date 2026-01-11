package org.java_tutorials.tuition.shahir.part_1.tutorials_1;


import java.util.Scanner;

/*
Write a program to input a sentence and count the number of words.
 */
public class Words {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = in.nextLine();
        int count = 0;
        s = s.trim();
        int k = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c != ' ')
                k = 0;
            else if (k == 0) {
                count += 1;
                k = i;
            }
        }
        System.out.println("Total number of words are : " + (count + 1));
    }
}
