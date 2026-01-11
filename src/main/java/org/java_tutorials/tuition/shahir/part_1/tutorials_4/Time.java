package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// q1 101
public class Time
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of pendulum");
        int l=in.nextInt();
        double time;
        time=(44/7)*Math.sqrt(l/9.8);
        System.out.println("The time period of pendulum is  "+time);
    }
}
