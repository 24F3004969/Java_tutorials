package org.java_tutorials.tuition.shahir.part_1.tutorials_9;

import java.util.Scanner;

public class Quadrilateral {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first side of Quadrilateral");
        int a=in.nextInt();
        System.out.println("Enter the second side of Quadrilateral");
        int b=in.nextInt();
        System.out.println("Enter the third side of Quadrilateral");
        int c=in.nextInt();
        System.out.println("Enter the fourth side of Quadrilateral");
        int d=in.nextInt();
        if (a==b&&b==c&&c==d)
            System.out.println("square");
        else if(a==c && b==d)
            System.out.println("rectangle");
        else
            System.out.println("Some other quadrilateral");
    }
}
