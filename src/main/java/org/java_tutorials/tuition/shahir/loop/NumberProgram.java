package org.java_tutorials.tuition.shahir.loop;

public class NumberProgram {
    static void main(String[] args) {
        int n = 121;
        int t=n;
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println(rev+"   "+n);
        if (rev == t) {
            System.out.println("palendrom");
        }
        else {
            System.out.println("not palendrom");

        }
    }
}
