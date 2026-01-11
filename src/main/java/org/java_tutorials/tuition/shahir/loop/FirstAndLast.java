package org.java_tutorials.tuition.shahir.loop;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int length = word.length();
        System.out.println(word.charAt(0) + "     " + word.charAt(length - 1));
        System.out.println(word.substring(1, length-1));
        String newWord="";
        for (int i = 1; i <length-1 ; i++) {
            newWord=newWord+word.charAt(i);
        }
        System.out.println(newWord);
    }
}
