package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        int dice = 0;
        Scanner in = new Scanner(System.in);
        String s="";
        while (!s.equals("e")) {
            System.out.println("Enter any key to role dice or 'e' to exit.");
            s = in.nextLine();
            System.out.println("\033[H\033[J");
            dice = (int) (Math.random() * 6 + 1);
            switch (dice) {
                case 1:
                    System.out.println("-----\n" +
                            "|   |\n" +
                            "| o |\n" +
                            "|   |\n" +
                            "-----");
                    break;
                case 2:
                    System.out.println("-----\n" +
                            "|o  |\n" +
                            "|   |\n" +
                            "|  o|\n" +
                            "-----");
                    break;
                case 3:
                    System.out.println("-----\n" +
                            "|o  |\n" +
                            "| o |\n" +
                            "|  o|\n" +
                            "-----");
                    break;
                case 4:
                    System.out.println("-----\n" +
                            "|o o|\n" +
                            "|   |\n" +
                            "|o o|\n" +
                            "-----");
                    break;
                case 5:
                    System.out.println("-----\n" +
                            "|o o|\n" +
                            "| o |\n" +
                            "|o o|\n" +
                            "-----");
                    break;
                case 6:
                    System.out.println("""
                            -----
                            |o o|
                            |o o|
                            |o o|
                            -----
                            """);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
