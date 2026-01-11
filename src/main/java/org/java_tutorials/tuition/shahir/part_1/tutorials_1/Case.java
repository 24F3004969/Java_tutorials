package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
14. Write a program to input a sentence and change the case of each letter.
Eg:Input : WElCoMe to School Output: weLcOmE TO sCHOOL
 */
public class Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String n=scanner.nextLine();
        StringBuilder x= new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            if(Character.isUpperCase(n.charAt(i))){
                x.append(("" + n.charAt(i)).toLowerCase());
            }
            else if(Character.isLowerCase(n.charAt(i))){
                x.append(("" + n.charAt(i)).toUpperCase());
            }
            else x.append(n.charAt(i));
        }
        System.out.println(x);
    }
}
