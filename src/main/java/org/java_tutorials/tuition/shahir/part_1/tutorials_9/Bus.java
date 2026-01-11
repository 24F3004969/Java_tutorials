package org.java_tutorials.tuition.shahir.part_1.tutorials_9;

import java.util.Scanner;

public class Bus
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of children");
        int n=in.nextInt();
        System.out.println("Maximum no of bus needed is  = "+(n/15));
    }
}
