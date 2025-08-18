package org.java_tutorials.function;

import java.util.Scanner;

public class Abiya {
    public static void main(String[] args) {
        Abiya in = new Abiya();
        in.message();
        in.message();
        int x=in.product(3, 2, 4);
        int y=Math.max(4,6);
    }

    public int product(int a, int b, int c) {
        int p=a*b*c;
        return p;
    }

    public void message() {
        int a, b;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);
    }
}
