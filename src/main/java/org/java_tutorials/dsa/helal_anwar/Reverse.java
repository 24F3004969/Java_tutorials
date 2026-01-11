package org.java_tutorials.dsa.helal_anwar;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
			System.out.println("Enter the string ");
			var s=in.nextLine().toUpperCase();
			var s1=new StringBuilder(s);
			if (s1.reverse().toString().equals(s))
			    System.out.println("Palindrome string");
			else System.out.println("Not palindrome string");
		}
    }
}
