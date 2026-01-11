package org.java_tutorials.tuition.shahir.part_1.oop;

import java.util.*;

public class Stringop {
    String str;

    Stringop() {
        str = null;
    }

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence");
        str = in.nextLine();
    }

    void encode() {
        str = str.toUpperCase();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                if ((c + 2) > 90)
                    c = (char) (64 + (c + 2) - 90);
                else
                    c = (char) (c + 2);

            }
            s = s + c;
        }
        str = s;
    }

    void print() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                System.out.print(str.charAt(i));
            else
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Stringop op = new Stringop();
        op.accept();
        op.encode();
        op.print();
    }
}
