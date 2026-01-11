package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// pg 150 q 7
public class SecondSmallestNumber
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 numbers ");
        System.out.println("Enter first number :");
        int a=scanner.nextInt();
        System.out.println("Enter second number :");
        int b=scanner.nextInt();
        System.out.println("Enter third number ");
        int c=scanner.nextInt();
        int max,min;
        max=Math.max(a,b);
        max=Math.max(max,c);
        min=Math.min(a,b);
        min=Math.min(min,c);
        System.out.println("The second smallest number is ="+((a+b+c)-(max+min)));
    }
}
