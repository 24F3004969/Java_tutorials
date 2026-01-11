package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a;
        int i = 1;
        StringBuilder s= new StringBuilder();
        while (i <= 100000) {
           s.append("Helal ").append("\n").append("Hatif").append("\n");
            i = i + 1;
        }
        System.out.println(s);
    }
}
