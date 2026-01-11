package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=in.nextInt();
        System.out.println("Enter the second number");
        int b=in.nextInt();
        System.out.println("Enter the third number");
        int c=in.nextInt();
        int max=Math.max(a,b);
        max=Math.max(max,c);
        System.out.println("Max value is "+max);
    }
}
