package org.java_tutorials.dsa.algorithem;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the first   string");
        String a = new Scanner(System.in).nextLine();
        System.out.println("Enter the second   string");
        String b = new Scanner(System.in).nextLine();
        String max="", min="";
        if (a.length() == b.length())
        {
            max=a;
            min=b;
        }
        if (a.length()!=b.length())
        {
        if (a.length() > b.length())
            max = a;
        else max = b;
        if (a.length() < b.length())
            min = a;
        else min = b;
        }
        String S_a, S_b;
        String S="";
        int len_1 = 1, len_2 = 2;
        while (len_1 <= min.length() && len_2 <= max.length())
        {
            for (int i = 0; i <=min.length()-len_1; i++)
            {
                S_a = min.substring(i, i + len_1);
                for (int j = 0; j <= max.length()-len_2; j++)
                {
                    S_b = max.substring(j, j + len_2);
                    if (Reverse(S_a + S_b).equals(S_a + S_b)){
                        S = S_a + S_b;
                    }
                    else if (Reverse(S_b + S_a).equals(S_b + S_a))
                        S = S_b + S_a;
                    System.out.println(S);
                }
            }
            len_1++;
            len_2++;
        }
    }

    static String Reverse(String s) {
        return String.valueOf(new StringBuilder(s).reverse());
    }
}
