package org.java_tutorials.tuition.shahir.part_1.tutorials_12;

import java.util.Scanner;

public class my_first
{
    public static void main(String[] args) {
        int Number_1,Number_2,Sum;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your first number");
        Number_1=in.nextInt();
        System.out.println("Enter your second number");
        Number_2=in.nextInt();
        Sum=Number_1-Number_2;
        System.out.println("The diff of two numbers is ="+Sum);
    }
}
