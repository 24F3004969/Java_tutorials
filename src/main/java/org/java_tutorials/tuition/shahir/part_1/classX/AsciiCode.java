package org.java_tutorials.tuition.shahir.part_1.classX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder s = new StringBuilder();
        int key;
        Scanner scanner = new Scanner(new FileInputStream(args[0]));
        key = Integer.parseInt(args[1]);
        while (scanner.hasNext())
            s.append(scanner.nextLine()).append('\n');
        System.out.println("String is made");
        AsciiCode a = new AsciiCode();
        System.out.println("Welcome to Enigma machine");
        System.out.println("Your encrypted message is :");
        var z = a.encode(s.toString(), key);
        System.out.println(z);
        System.out.println("Your Decrypted  message is");
        System.out.println(a.DeCode(z, key));
    }

    private String encode(String s, int key) {
        System.out.println(s);
        int l = s.length();
        StringBuilder encode = new StringBuilder();
        key = key % 26;
        for (int i = 0; i < l; i++) {
            int k = s.charAt(i);
            int c = !Character.isLetter(k) ? k : k + key;
            if (Character.isUpperCase(k) && c > 90)
                c = 'A' + (c - 91);
            else if (Character.isLowerCase(k) && c > 122)
                c = 'a' + (c - 123);
            encode.append((char) c);
        }
        return encode.toString();
    }

    private String DeCode(String s, int key) {
        int l = s.length();
        StringBuilder deCode = new StringBuilder();
        key = key % 26;
        for (int i = 0; i < l; i++) {
            int k = s.charAt(i);
            int c = !Character.isLetter(k) ? k : k - key;
            if (Character.isUpperCase(k) && c < 65)
                c = 'Z' - (64 - c);
            else if (Character.isLowerCase(k) && c < 97)
                c = 'z' - (96 - c);
            deCode.append((char) c);
        }
        return deCode.toString();
    }

    public void message() {
        System.out.println("Hello this is a secreat message");
        System.out.println("I am big fan of java 21");
    }
}
