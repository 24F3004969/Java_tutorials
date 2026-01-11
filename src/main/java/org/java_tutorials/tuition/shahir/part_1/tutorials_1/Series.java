package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
11. Create a class to print sum of the following series :
S= x^2– x^4+ x^6 – x^8+………. x20
 */
public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x=scanner.nextInt();
        double s=0;
        for (int i = 1; i <=10; i++) {
            s= i % 2 == 0 ? s + Math.pow(x, 2 * i) : s - Math.pow(x, 2 * i);
        }
        System.out.println("The sum of series "+s);
    }
}
