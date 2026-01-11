package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// pg 189 q8
public class countDigit
{
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n=in.nextInt();
			int count=0;
			while (n>0){
			    count++;
			    n=n/10;
			}
			System.out.println("The numbers of digits in number is "+count);
			if (count%2==0)
			    System.out.println("The number of digits are even");
			else
			    System.out.println("The number of digits are odd");
		}
    }
}
