package org.java_tutorials.tuition.shahir.loop;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("""
                   _____                    _      \s
                  / ____|                  (_)     \s
                 | (___  _   _ __________ _ _ _ __ \s
                  \\___ \\| | | |_  /_  / _` | | '_ \\\s
                  ____) | |_| |/ / / / (_| | | | | |
                 |_____/ \\__,_/___/___\\__,_|_|_| |_|
                
                
                """);

        int[] a = new int[10];
        double b[] = new double[10];
        String names[] = new String[10];
        String s[] = {"apple", "mango", "banana"};
        s[1] = "grapes";
        for (int i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(IO.readln("enter  number : "));
        }
        int mx = a[0];
        int smax = a[0];
        for (int i = 1; i < 10; i++) {
            if (a[i] > mx) {
                smax = mx;
                mx = a[i];
            }
        }
        System.out.println(smax);
        System.out.println(mx);
    }
}
