package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// Q1 Pg=117
public class MaxAndMin
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
        System.out.println("The largest among the three numbers is "+max);
        System.out.println("The smallest among the three numbers is "+min);
        System.out.println("The sum of maximum and minimum number is : "+(max+min));

    }
}
