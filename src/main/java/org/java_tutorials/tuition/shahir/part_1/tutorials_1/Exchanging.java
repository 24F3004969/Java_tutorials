package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

public class Exchanging
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int a = in.nextInt();
        int l=a%10;
        int m=(a/10)%10;
        int f=a/100;
        System.out.println("Original number is "+a);
        System.out.println("Number after exchanging the digit "+l+m+f);
    }
}
