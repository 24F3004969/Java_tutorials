package org.java_tutorials.loop;

public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i = i * 2) {
            if (i < 128)
                System.out.println(i + "\tJava");
            else
                break;
        }
    }
}
