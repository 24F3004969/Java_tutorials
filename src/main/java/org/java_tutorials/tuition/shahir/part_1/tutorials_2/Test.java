package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

import java.util.*;
// wap to input two number and add them
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=scanner.nextInt();
        System.out.println("Enter the second number");
        int b=scanner.nextInt();
        int sum=a+b;
        int d=a-b;
        int p=a*b;
        int q=a/b;
        int r=a%b;
        System.out.println("The sum of two numbers are "+sum);
        System.out.println(d);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
