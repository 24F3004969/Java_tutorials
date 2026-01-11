package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
//pg 191 q 24
public class Series {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1 for Series1 number and 2 for series2");
        System.out.println("Enter your choice");
        int ch=scanner.nextInt();
        System.out.println("Enter your number");
        int n=scanner.nextInt();
        switch (ch) {
            case 1 -> {
                double s = 0.0;
                for (int i = 0; i <= 20; i++) {
                    if (i % 2 == 0)
                        s = s + Math.pow(2, i);
                    else
                        s = s - Math.pow(2, i);

                }
            }
            case 2 -> {
                int s = 0;
                for (int i = 0; i < n; i++) {
                    s = s + (int) (Math.pow(10, i));
                    System.out.print(s + ",");
                }
            }
            default -> System.out.println("Error");
        }
    }
}
