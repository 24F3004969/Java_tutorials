package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
12. Write a program to input a number and check whether it is a perfect number or not .
Eg: 6= 1+2+3
 */
public class Perfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int s=0;
        for (int i = 1; i <n; i++) {
            if(n%i==0)
                s=s+i;
        }
        if(s==n)
            System.out.println("org.java_tutorials.tutorials_1.Perfect");
        else
            System.out.println("Not org.java_tutorials.tutorials_1.Perfect");
    }
}
