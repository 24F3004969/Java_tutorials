package org.java_tutorials.part_2.task;

public class GenericPattern {
    void pattern1(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, s.length() - i));
        }
    }
    void pattern11() {
        String []s={"B","L","U","E","J"};
        for (int i = 0; i <s.length; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(s[j]);
            }
            System.out.println();
        }
    }
    void pattern12() {
        String []s={"B","L","U","E","J"};
        for (int i = 0; i <s.length; i++) {
            System.out.print((i+1));
            for (int j = 0; j<=i; j++) {
                System.out.print(s[i]);
            }
            System.out.println();
        }
    }
    void pattern13(String s) {
        for (int i = 0; i <s.length(); i++) {
            System.out.print((i+1));
            for (int j = 0; j<=i; j++) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
    void pattern2(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0,i+1));
        }
    }

    public static void main(String[] args) {
        GenericPattern gp = new GenericPattern();
        gp.pattern12();
        gp.pattern13("Zoya&Ayesha");
    }
}
