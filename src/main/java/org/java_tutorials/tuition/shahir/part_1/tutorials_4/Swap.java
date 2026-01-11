package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// q8 PG=102
public class Swap
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=scanner.nextInt();
        System.out.println("Enter the second number ");
        int b=scanner.nextInt();
        int c = a+b;
        b=c-b;
        a=c-b;
        System.out.println("The new value of fist number is ="+a);
        System.out.println("The new value of second number is ="+b);
    }
}
