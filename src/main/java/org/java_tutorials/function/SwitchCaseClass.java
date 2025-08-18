package org.java_tutorials.function;

import java.util.Scanner;

public class SwitchCaseClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number for emoji");
        int nu = in.nextInt();
        switch (nu) {
            case 0,1 : System.out.println("😰");break;
            case 2 : System.out.println("❤️");break;
            case 3 : System.out.println("😭");break;
            default : System.out.println("Let lost 😀😀");
        }

    }
}
