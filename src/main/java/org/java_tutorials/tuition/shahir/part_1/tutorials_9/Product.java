package org.java_tutorials.tuition.shahir.part_1.tutorials_9;

import java.util.Scanner;

public class Product
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a four digit number");
        int a=in.nextInt();
        int l=a%10;
        int f=a/1000;
        int n=(l+f);
        System.out.println("Sum = "+n);
        System.out.println("Project = "+l*f);
    }

}
