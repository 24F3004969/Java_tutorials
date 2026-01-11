package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
1. Write a program to input three different numbers of two digits each and
print the sum of the digits of the mid number(the number which is neither
greatest nor smallest)
For example: if input is 23, 38, 12 then the output should be:
Mid number is 23
Sum of digits of mid number is 5 (2+3)
 */
public class MidNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a two digit number");
        int a=in.nextInt();
        System.out.println("Enter a two digit number");
        int b=in.nextInt();
        System.out.println("Enter a two digit number");
        int c=in.nextInt();
        int max=Math.max(a,Math.max(b,c));
        int min=Math.min(a,Math.min(b,c));
        int mid_number=(a+b+c)-(max+min);
        System.out.println("Middle number is = "+mid_number);
        int x=mid_number%10;
        int y=mid_number/10;
        System.out.println("Sum of digit of middle number is = "+(x+y));
    }
}
