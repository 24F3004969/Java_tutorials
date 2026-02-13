package org.java_tutorials.dsa.fun;/*
n=5
5 X 1 = 5
5 X 2 = 10
..
 */

class Table {
    public static void main(String[] args) {
        for (int j = 1; j <= 50; j++) {

            for (int i = 1; i <= 80; i++) {
                if (i % 2 == 0 && j % 2 == 0)
                    System.out.print("█");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}