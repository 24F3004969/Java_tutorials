package org.java_tutorials.dsa.algorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Pip {
    public static void main(String[] args) {
        TreeSet<String> a = new TreeSet<>();
        System.out.println("Enter the elements");
        System.out.println("Enter /e to exit");
        String Temp;
        do{
            Temp=new Scanner(System.in).nextLine();
            if (!Temp.equalsIgnoreCase("/e"))
             a.add(Temp);
        }while (!Temp.equalsIgnoreCase("/e"));
        int c = 0;
        int g=1;
        ArrayList<Integer> group=new ArrayList<>();
        for (String value : a) {

            for (String s : a)
            {
                if ((value.length()>=g&&s.length()>g)&&(value.substring(0, g).equals(s.substring(0, g))))
                    c++;
            }
            if (c > 1) {
                group.add(g);
            }
            g++;
        }
        System.out.println(group);
        System.out.println(g);
    }
}
