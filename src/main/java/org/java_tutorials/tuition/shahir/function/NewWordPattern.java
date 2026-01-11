package org.java_tutorials.tuition.shahir.function;

public class NewWordPattern {
    public static void main(String[] args) {
        String str = IO.readln("Enter a string: ");
        IO.println(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 1; j <=i ; j++) {
                IO.print(" ");
            }
            IO.println(ch);
        }
    }
}
