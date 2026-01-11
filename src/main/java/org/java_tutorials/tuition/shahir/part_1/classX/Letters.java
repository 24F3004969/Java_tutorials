package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        String s;
        s=in.nextLine();
        int l=s.length();
        int count=0;
        for (int i = 0; i <l ; i++) {
            char c=s.charAt(i);
            /*if (Character.isLetter(c))
                count++;*/
            if (c>=65 && c<=90)
                count++;
            else if (c>=97 && c<=122)
                count++;

        }
        System.out.println(count);
    }
}
