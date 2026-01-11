package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;

public class EqualMax
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
        if (b == c && c == a)
            System.out.println();
        else {
            int max;
            max=Math.max(a,b);
            max=Math.max(max,c);
            System.out.println("The largest among the three numbers is "+max);

        }
    }
}
