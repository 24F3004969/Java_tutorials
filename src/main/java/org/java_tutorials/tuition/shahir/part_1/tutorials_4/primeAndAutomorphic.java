package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// pg 190 q 17
public class primeAndAutomorphic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1 for prime number and 2 for automorphic number");
        System.out.println("Enter your choice");
        int ch=scanner.nextInt();
        System.out.println("Enter your number");
        int n=scanner.nextInt();
        switch (ch) {
            case 1 -> {
                int co = 0;
                for (int i = 1; i < n; i++)
                    if (n % i == 0)
                        co++;
                if (co == 2)
                    System.out.println("prime number");
                else System.out.println("not prime number");
            }
            case 2 -> {
                int sq = n * n;
                int count = 0;
                while (n > 0) {
                    count++;
                    n = n / 10;
                }
                if ((sq % Math.pow(10, count)) == Math.sqrt(sq))
                    System.out.println("Automorphic number");
                else
                    System.out.println("Not a Automorphic number");
            }
            default -> System.out.println("Illegal choice");
        }
    }
}
