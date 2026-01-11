package org.java_tutorials.tuition.shahir.part_1.classIX;

import jdk.jshell.JShell;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (
                Scanner in = new Scanner(System.in);
                var x = JShell.create()
        ) {
            System.out.println("Enter your " +
                    "expression or 'e' to exit");
            String expression = in.nextLine();
            while (!expression.equals("e")) {
                var val = x.eval(expression).
                        getFirst().value();
                System.out.println(val != null ?
                        val :
                        "\033[0;31mBad expression\33[0m");
                System.out.println("Enter your " +
                        "expression or 'e' to exit");
                expression = in.nextLine();
            }
        }
    }
}
