package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to find the area of circle");
        System.out.println("Enter 2 to subtract");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide");
        System.out.println("Please enter your choice");
        int ch;
        int a,b,d;
        ch = in.nextInt();
        switch (ch) {
            case 1: {
                System.out.println("You can find the area of circle");
                System.out.println("Please enter the radius");
                int r;
                r=in.nextInt();
                double A=0.;
                A=Math.PI*r*r;
                System.out.println("Area is = "+A);
            }
            break;
            case 2:
                System.out.println("Enter two numbers");
                a = in.nextInt();
                b = in.nextInt();
                d = a - b;
                System.out.println("The difference is = " + d);

            break;
            case 3:
            {
                System.out.println("Enter two numbers");
                a = in.nextInt();
                b = in.nextInt();
                int p;
                p = a * b;
                System.out.println("The product is = " + p);
            }
                break;
            case 4:
            {
                System.out.println("Enter two numbers");
                a = in.nextInt();
                b = in.nextInt();
                d = a / b;
                System.out.println("The divide is = " + d);
            }
                break;
            default:
                System.out.println("invalid");
        }
    }
}
