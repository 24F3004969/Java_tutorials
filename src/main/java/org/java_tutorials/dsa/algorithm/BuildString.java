package org.java_tutorials.dsa.algorithm;

import java.util.Scanner;

public class BuildString {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        String sub = "";
        System.out.println("Enter the number of test cases");
        int cases = new Scanner(System.in).nextInt();
        String sr = "";
        for (int k = 1; k <= cases; k++)
        {
            System.out.println("Enter a s ");
            String s = new Scanner(System.in).nextLine();
            System.out.println("Enter the price for entering a s at end");
            int a = new Scanner(System.in).nextInt(), TotalScore = 0;
            System.out.println("Enter the price for entering te substring at end");
            int b = new Scanner(System.in).nextInt();
            for (int i = 0; i < s.length(); i++)
            {
                for (int j = i; j < s.length(); j++) {
                    sr = sr + s.charAt(j);
                    if (str.toString().contains(sr))
                        sub = sr;
                    else {
                        sr = "";
                        break;
                    }
                }
                if (sub.length() > 1) {
                    TotalScore = TotalScore + b;
                    str.append(sub);
                    i = i + sub.length() - 1;
                } else {
                    TotalScore = TotalScore + a;
                    if (sub.equals(""))
                        str.append(s.charAt(i));
                    else {
                        str.append(sub);
                    }
                }
                sub = "";
            }
            System.out.println(TotalScore);
            sr ="";
            sub="";
            str=new StringBuffer();
        }

    }
}
