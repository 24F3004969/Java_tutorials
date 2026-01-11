package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Kripya do number dale");
        a = in.nextInt();
        b = in.nextInt();
        if (a % 5 == 0 && b % 5 == 0)
            System.out.println("Numbers are divisible by 5");
        else System.out.println("Numbers are not divisible by 5");
    }
}
