package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

/*
8.Create a class to print following pattern (using loops) :-
a
ab
abc
abcd
abcde
 */
public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 97; i <=101; i++) {
            for (int j = 97; j<= i; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
