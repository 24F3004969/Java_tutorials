package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        n = n > 12 && n % 3 == 0 ? n / 3 : 16 / 4;
        System.out.println(n);
    }
}
