package org.java_tutorials.dsa.algorithem;

import java.util.ArrayList;
import java.util.Scanner;

public class CountStrings {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        String string = new Scanner(System.in).nextLine();
        String abb = "", sub = "";
        ArrayList<Integer> functionalValue = new ArrayList<>();
        int point = 0;
        for (int i = 0; i < string.length(); i++)
        {
            abb = string.substring(0, i + 1);
            for (int j = 0; j <= string.length() - abb.length(); j++)
            {
                sub = string.substring(j, j + abb.length());
                if (sub.equals(abb)) {
                    point = point + abb.length();
                }
            }
            functionalValue.add(point);
            point=0;
        }
        System.out.println(functionalValue);
    }
}
