package org.java_tutorials.tuition.shahir.part_1.tutorials_12;

import java.util.Scanner;

public class TOM
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to four bar link calculation");
        System.out.println("This program can find the angular acc and angular acc of+"+"\n"+"of a four bar link mechanism");
        System.out.println("Enter the length of four bar on by one :");
        double a,b,d;
        a=in.nextDouble();
        b=in.nextDouble();
        d=in.nextDouble();
        double x,y;
        System.out.println("Enter the angele that 'a' makes with x axis");
        x=in.nextDouble();
        System.out.println("Enter the angele that 'b' makes with x axis");
        y=in.nextDouble();
        System.out.println("Enter the angular velocity of 'a'");
        double Wa=in.nextDouble();
        double Wb,Wc;
        double v = a * Math.sin(x - y);
        double v1 = v + d * Math.sin(y);
        Wb=(a/b)*Wa*((b*Math.sin(x-y)-d*Math.sin(x))/ v1);
        Wc=Wa*a*Math.sin(x-y)/ v1;
        System.out.println("The angular velocity of b ="+Wb);
        System.out.println("The angular velocity of c ="+Wc);
    }
}
