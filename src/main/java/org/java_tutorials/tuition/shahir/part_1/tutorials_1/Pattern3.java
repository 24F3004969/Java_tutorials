package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

/*
7.Create a class to print following pattern (using loops) :-
54321
5432
543
54
5
 */
public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j>= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
