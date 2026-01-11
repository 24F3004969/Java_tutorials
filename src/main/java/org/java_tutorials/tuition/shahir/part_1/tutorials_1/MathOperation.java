package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
1.Define a class “org.java_tutorials.tutorials_1.MathOperation” to perform the following operation depending upon the users
choice.
User will enter and option as an integer between 1 to 3 in a variable opt and another number as
value in a variable num of type double.
If opt is 1 print absolute value of num.
If opt is 2 print square root num.
If opt is 3 , raise power of num to 3.
 */
public class MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        switch (n) {
            case 1 -> System.out.println("absolute value of number " + Math.abs(n));
            case 2 -> System.out.println("square root number " + Math.sqrt(n));
            case 3 -> System.out.println("org.java_tutorials.tutorials_1.Cube of number " + Math.pow(n, 3));
        }
    }
}
