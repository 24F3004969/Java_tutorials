package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

public class Pattern
{
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for ( int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int a = 1; a <=2*(n-i); a++) {
                System.out.print(" ");
            }
            for (int k = i; k >=1 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
