package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// Q 7 PG=102
public class TimeConversion
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter time in second");
        int s,m,h;
        s=scanner.nextInt();
        h=s/3600;
        m=s%3600;
        s=m%60;
        m=m/60;
        System.out.println("Enter the number of hours in your time = "+h);
        System.out.println("Enter the number of minutes in your time = "+m);
        System.out.println("Enter the number of second in your time = "+s);
    }
}
