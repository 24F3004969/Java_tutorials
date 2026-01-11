package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
18. Write a program to accept a name and display its initials along with the org.java_tutorials.tutorials_1.surname
Eg. Input: Mahendra Singh Dhoni Output: M.S. Dhoni
 */
public class surname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String n=scanner.nextLine();
        n=n.trim();
        String f=""+n.charAt(0);
        String s=""+n.charAt(n.indexOf(' ')+1);
        String l=n.substring(n.lastIndexOf(' ')+1);
        System.out.println(f+"."+s+"."+l);
    }
}
