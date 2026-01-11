package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;

public class ASCII
{
    public static void main(String[] args) {
       double a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=scanner.nextDouble();
        System.out.println("Enter the second number");
        b=scanner.nextDouble();
        System.out.println("Sum of two number is: "+(a+b));
        System.out.println("minus of two number is: "+(a-b));
        System.out.println("product of two number is: "+(a*b));
        System.out.println("division of two number is: "+(a/b));
        System.out.println("mode of two number is: "+(a%b));
    }
}
