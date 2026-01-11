package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

import java.util.Scanner;

public class ScannerPuzzle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=a+b;
        System.out.println("Enter your name");
        String name=in.nextLine();
        System.out.println(name+" your sum is = "+sum);
    }
}
