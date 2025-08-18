package org.java_tutorials.part_2.task;

import org.java_tutorials.part_1.classX.Function;

public class Combination {
    int fac(int n) {
        return Function.fac(n);
    }

    int com(int n, int r) {
        int a = fac(n);
        int b = fac(n - r);
        int c = fac(r);
        return a / (b * c); //or fac(n)/(fac(n-r)*fac(r));
    }

    public static void main(String[] args) {
        Combination obj = new Combination();
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you wish to enter: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = obj.com(x, y);
        System.out.println(a);*/
        System.out.println(obj.sum(10));
    }

    int sum(int n) {
        return (n > 1) ? n + sum(n - 1) : n;
    }
}
