package org.java_tutorials.tuition.shahir.part_1.classIX;


import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Enter three number");
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int max, min = 0;
        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else
            max = c;
        if (a < b && a < c)
            min = a;
        else if (b < a && b < c)
            min = b;
        else
            min = c;
        System.out.println("The max number is "+max);
        System.out.printf("The min number is %d",min);
    }
}
