package org.java_tutorials.tuition.shahir.part_1.tutorials_10;

import java.util.Date;
import java.util.Scanner;

class Box
{
    double width;
    double length;
    double height;
    Box(double a,double b,double c){
        Scanner in=new Scanner(System.in);
        int z;
        System.out.println("Enter value");
        z=in.nextInt();
        System.out.println(z);
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println("Hello World");
        width=a;
        length=b;
        height=c;
    }
}
