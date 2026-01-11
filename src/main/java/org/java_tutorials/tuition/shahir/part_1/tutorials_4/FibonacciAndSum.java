package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// pg 190 q 19
public class FibonacciAndSum
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1 for Fibonacci number and 2 for sum of the digits of  number");
        System.out.println("Enter your choice");
        int ch=scanner.nextInt();
        System.out.println("Enter your number");
        int n=scanner.nextInt();
        switch (ch) {
            case 1 -> {
                int a = 0, b = 1, c;
                System.out.print(a + "," + b);
                for (int i = 3; i <= n; i++) {
                    c = a + b;
                    System.out.print("," + c);
                    a = b;
                    b = c;
                }
                break;
            }
            case 2 -> {
                int s = 0;
                while (n > 0) {
                    s = s + (n % 10);
                    n = n / 10;
                }
                System.out.println("The sum of digit of number are " + s);
                break;
            }
            default -> System.out.println("Error");
        }
    }
}
