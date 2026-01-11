package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;

// Q 20 pg=153
public class KamaElectronic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.nextLine();
        System.out.println("Enter 'D ' for Desktop and 'L'");
        String choice=scanner.nextLine();
        System.out.println("Enter the amount of purchase");
        int amount = scanner.nextInt();
        switch (choice)
        {
            case "D": {
                double D = 0.0;
                if (amount <= 25000)
                    D = 0.05 * amount;
                if (amount >= 25001 && amount <= 50000)
                    D = 0.075 * amount;
                if (amount >= 50001 && amount <= 100000)
                    D = 0.1 * amount;
                if (amount > 100000)
                    D = 0.15 * amount;
                System.out.println("Net amount to be paid =" + (amount - D));
            }
            break;
            case "L": {
                double D = 0.0;
                if (amount <= 25000)
                    D = 0.0;
                if (amount >= 25001 && amount <= 50000)
                    D = 0.05 * amount;
                if (amount >= 50001 && amount <= 100000)
                    D = 0.075 * amount;
                if (amount > 100000)
                    D = 0.1 * amount;
                System.out.println("Net amount to be paid =" + (amount - D));
            }
            break;
            default:
                System.out.println("Illegal choice");
        }
    }
}
