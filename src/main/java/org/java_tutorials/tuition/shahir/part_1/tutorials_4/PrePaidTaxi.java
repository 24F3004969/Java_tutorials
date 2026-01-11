package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;

//Q 9 PG 150
public class PrePaidTaxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int max = a > b ? a * b : b * 3;
    }
}
