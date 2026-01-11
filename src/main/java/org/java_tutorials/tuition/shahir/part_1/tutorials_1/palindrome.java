package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
15.Write a program to input a word and check whether it is a org.java_tutorials.tutorials_1.palindrome or not.
Example: MADAM – org.java_tutorials.tutorials_1.palindrome class – not org.java_tutorials.tutorials_1.palindrome
 */
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=scanner.nextLine();
        StringBuilder builder=new StringBuilder(s);
        if(builder.reverse().toString().equals(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
