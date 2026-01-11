package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class StringFunction
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String sr,s1="";
        sr = in.nextLine();
        System.out.println(sr);
        int l=sr.length();
        System.out.println("The name is of "+l+" letters");
        int count=0;
        for (int i = 0; i < l; i++)
        {
            char c=sr.charAt(i);
            s1=c+s1;
            System.out.println(c);
        }
        System.out.println(s1);
    }
}
