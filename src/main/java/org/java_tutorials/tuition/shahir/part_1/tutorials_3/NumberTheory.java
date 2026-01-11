package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

public class NumberTheory
{
    public static void main(String[] args) {
        System.out.println(perfect_square(256) ? "Perfect square" : "Not a perfect square");
    }

    private static boolean perfect_square(int num) {
        return (Math.sqrt(num)==(int)Math.sqrt(num));
    }
}
