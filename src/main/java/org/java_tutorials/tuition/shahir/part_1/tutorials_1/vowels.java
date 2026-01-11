package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
16. Write a program to input a word and count the number of org.java_tutorials.tutorials_1.vowels.
 */
public class vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String n=scanner.nextLine();
        n=n.toLowerCase();
        int c=0;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
                c++;
        }
        System.out.println("Number of org.java_tutorials.tutorials_1.vowels "+c);
    }
}
