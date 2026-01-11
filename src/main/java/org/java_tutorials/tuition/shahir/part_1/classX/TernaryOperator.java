package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

class TernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        System.out.println(n % 2 == 0 ? "even number" : "odd number");
    }
}
