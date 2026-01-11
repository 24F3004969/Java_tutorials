package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Scanner;

public class ShaadTest {
    public static void main(String[] args) {
        String a[] = new String[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextLine();
        }
        String max_str = a[0];
        for (int i = 0; i < 5; i++) {
            if (a[i].length() > max_str.length()) {
                max_str = a[i];
            }

        }
        System.out.println(max_str);
    }
}
