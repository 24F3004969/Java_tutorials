package org.java_tutorials.function;

import java.io.Console;

public class ReadPassword {
    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");
        System.out.println("Your name: " + name);
        System.out.println("Your password is: " + new String(password));
    }
}
