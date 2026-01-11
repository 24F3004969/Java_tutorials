package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=0;
        String s1="";
        for (int i = 0; i<s.length(); i++) {
           char c=s.charAt(i);
           if (c>='P' && c<='Y')
               s1=s1+(char)(c+32);
           else s1=s1+c;
        }
        System.out.println(s1);
    }
}
