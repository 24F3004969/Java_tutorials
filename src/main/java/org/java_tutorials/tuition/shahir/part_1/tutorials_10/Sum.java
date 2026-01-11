package org.java_tutorials.tuition.shahir.part_1.tutorials_10;

import java.util.Scanner;

class Sum
{
    Sum(int a,int b){
        System.out.println("The sum of two numbers = " +(a+b));
        Diff diff=new Diff(9,100);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        a=in.nextInt();
        System.out.println("Enter a number");
        b=in.nextInt();
        diff.product(a,b);
    }
}
