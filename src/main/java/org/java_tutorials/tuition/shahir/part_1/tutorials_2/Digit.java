package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

import java.util.Scanner;

/*
Write a program to enter a number and find the number of digits present in the number.

 */
public class Digit
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=in.nextInt();
        if(a>=0 && a<=9)
            System.out.println("Single digit number");
        else if(a>=100 && a<=999)
            System.out.println("Three  digit number");
        else if(a>=1000 && a<=9999)
            System.out.println("Four  digit number");

    }
}
