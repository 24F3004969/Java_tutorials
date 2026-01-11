package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

import java.util.Scanner;

/*
Write a program to enter time in second and find number of hours,minutes,seconds in the
given time.
 */
public class Time {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the time in second");
        int time=in.nextInt();
        int h=time/3600;
        time=time%3600;
        int m=time/60;
        time=time%60;
        System.out.println(h);
        System.out.println(m);
        System.out.println(time);
    }
}
