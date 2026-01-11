package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class Function {
    public static int fac(int n) {
        int f=1;
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Function f=new Function();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n and r");
        int n,r;
        n=in.nextInt();
        r=in.nextInt();
        int A=f.fac(n);
        int B=f.fac(n-r);
        int C=f.fac(r);
        int s=A/(B*C);
        System.out.println(s);
    }
}
