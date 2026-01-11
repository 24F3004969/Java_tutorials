package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
10. Write a program to input two numbers and find the HCF and LCM
 */
public class HCF_and_LCM {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int a=scanner.nextInt();
			System.out.println("Enter a number");
			int b=scanner.nextInt();
			int p=a*b;
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			while (max % min != 0) {
			    int temp = min;
			    min = max % min;
			    max = temp;
			}
			System.out.println(min);
			System.out.println(p/min);
		}
    }
}
