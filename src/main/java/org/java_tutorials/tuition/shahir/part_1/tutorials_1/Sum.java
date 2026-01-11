package org.java_tutorials.tuition.shahir.part_1.tutorials_1;
import java.util.*;
public class Sum {
	public static void main(String []args) {
		System.out.println("Enter a number");
		int a,b,c;
		try (var in = new Scanner(System.in)) {
			a=in.nextInt();
			System.out.println("Enter a number");
			b=in.nextInt();
			c=a+b;
		}
		System.out.println("The sum is = "+c);
	}
}
