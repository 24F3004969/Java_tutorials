package org.java_tutorials.tuition.shahir.part_1.tutorials_12;

import java.util.Scanner;

public class size
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.println("Enter the 1 No:");
        int a=in.nextInt();
        System.out.println("Enter the 2 No:");
        int b=in.nextInt();
        System.out.println("Enter the 3 No:");
        int c=in.nextInt();
        if (a>b && a>c)
            System.out.println(a+" is the largest number");
        if (b>a && b>c)
            System.out.println(b+" is the largest number");
        if (c>a&& c>b)
            System.out.println(c+" is the largest number");
    }
}
