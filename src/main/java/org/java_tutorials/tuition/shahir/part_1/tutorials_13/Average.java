package org.java_tutorials.tuition.shahir.part_1.tutorials_13;

import java.util.Scanner;

class Average{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a,b,c;
        a=in.nextInt();
        System.out.println("Enter the second number");
        b=in.nextInt();
        System.out.println("Enter the third number");
        c=in.nextInt();
        int s=a+b+c;
        int avg=s/3;
        System.out.println("Your sum is = "+s);
        System.out.println("Your average of numbers is = "+avg);
    }
}
