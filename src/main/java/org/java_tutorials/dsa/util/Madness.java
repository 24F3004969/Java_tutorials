package org.java_tutorials.dsa.util;

/**
 * @author hilal on 16-03-2023
 * @project Java_tutorials
 */
public class Madness {
    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n, r;
        n = in.nextInt();
        r = n - 4 * (n / 4);
        if (r == 0 || (r > 1 && r < 3))
            System.out.println("even");
        else System.out.println("odd");*/
        for (int i = 0; i < 100000; i++) {
            System.out.println(isEven(i) ? "even" : "odd");
        }

    }

    public static boolean isEven(int n) {
        int r = n - 4 * (n / 4);
        return r == 0 || (r == 2);
    }


}
