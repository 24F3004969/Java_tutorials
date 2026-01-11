package org.java_tutorials.tuition.shahir.function;

import java.util.Scanner;

/*
1
1 2 3
1 2 3 4
1 2 3 4 5

s=1!+2!+3!+4!+...............n terms
 */
public class NestedLoop {
    public void question1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void question2(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            int f = 1;
            for (int j = 1; j <= i; j++) {
                f = f * j;
            }
            s = s + f;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
       NestedLoop nl = new NestedLoop();
       nl.question1();
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nl.question2(n);
    }
}
