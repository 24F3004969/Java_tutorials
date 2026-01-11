package org.java_tutorials.tuition.shahir;

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of p : ");
        int p = in.nextInt();
        System.out.println("Enter the value of r : ");
        int r = in.nextInt();
        System.out.println("Enter the value of t : ");
        int t = in.nextInt();
        double si = p * r * t / 100.0;
        double amount = si + p;
        System.out.println("Si = " + si);
        System.out.println("Amount = " + amount);
    }
}
