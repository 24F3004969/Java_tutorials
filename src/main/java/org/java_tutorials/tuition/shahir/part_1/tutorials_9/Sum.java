package org.java_tutorials.tuition.shahir.part_1.tutorials_9;

import java.util.Scanner;

/*
2. Write a program to input a four digit number, extract the first digit and last
digit, calculate their sum and print it's square and cube using mathematical
function.
For example:
sample input:1257
sample output:
Square = 64 (1+7 = 8, 8*8)
Cube= 512(8*8*8)
 */
public class Sum
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a four digit number");
        int a=in.nextInt();
        int l=a%10;
        int f=a/100;
        int n=(l+f);
        System.out.println("Square = "+(n*n));
        System.out.println("Cube = "+(n*n*n));
    }
}
