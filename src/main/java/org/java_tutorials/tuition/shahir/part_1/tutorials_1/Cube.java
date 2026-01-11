package org.java_tutorials.tuition.shahir.part_1.tutorials_1;/*
2. Write a program to input a two digit number and print the value of the first
digit to the power of last digit and also print the cube of last digit.
 For example: if input is 63, then the output should be:
 Value is 216 (63
)
 org.java_tutorials.tutorials_1.Cube of last digit is 27(33
)
 */
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a two digit number");
        int a = in.nextInt();
        int x=a%10;
        int y=a/10;
        System.out.println("Power to last digit "+Math.pow(y,x));
        System.out.println("org.java_tutorials.tutorials_1.Cube of last digit "+Math.pow(x,3));
    }
}
