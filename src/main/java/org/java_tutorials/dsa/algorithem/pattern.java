package org.java_tutorials.dsa.algorithem;

import java.io.IOException;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Enter the size");
        boolean condition = true;
        int size = new Scanner(System.in).nextInt();
        for (int i = 1; i <= size / 2; i++) {
            if (condition)
                circle(size, size - 2 * i + 1, 2 * i);
            else
                hollow(size, i);
            if (i == size / 2) {
                i = 1;
                condition = !condition;
            }
            Thread.sleep(200);
            clrscr();
        }
    }

    public static void hollow(int size, int begin) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == begin && (j >= begin && j <= size - begin + 1))
                    System.out.print(" * ");
                else if ((i > begin && i < size - begin + 1) && (j == begin || j == size - begin + 1))
                    System.out.print(" * ");
                else if (i == size - begin + 1 && (j >= begin && j <= size - begin + 1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void filled(int size, int begin) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == begin && (j >= begin && j <= size - begin + 1))
                    System.out.print("   ");
                else if ((i > begin && i < size - begin + 1) && (j == begin || j == size - begin + 1))
                    System.out.print("   ");
                else if (i == size - begin + 1 && (j >= begin && j <= size - begin + 1))
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void circle(int size, int d, int begin) {
        int k = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i >= begin && i <= d) {
                    if (j > value(d / 2, k) && j <= cord(d / 2, k))
                        System.out.print(" * ");
                    else System.out.print("   ");
                } else System.out.print("   ");
            }
            if (i >= begin && i <= d)
                k++;
            System.out.println();
        }
    }

    public static void clrscr() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }

    public static int value(int r, int i) {
        return (int) Math.round((r - Math.sqrt(r * r - ((r - i) * (r - i)))));
    }

    public static int cord(int r, int i) {
        return (int) Math.round(2 * (Math.sqrt(r * r - ((r - i) * (r - i)))));
    }


}
