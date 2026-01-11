package org.java_tutorials.dsa.helal_anwar;



import org.java_tutorials.dsa.helal_anwar.Alphabet.UpperCase;
import org.java_tutorials.dsa.helal_anwar.Number.Digits;

import java.util.ArrayList;

class Merger {
    private String c_;
    private final int val;
    private String str;
    private final ArrayList<String[][]> x = new ArrayList<>();
    private String[][] ab;
    Merger(int val, String c_, String str) {
        this.c_ = c_;
        this.str = str;
        this.val = val;
    }
    void setC_(String c_) {
        this.c_ = c_;
    }
    void setStr(String str) {
        this.str = str;
    }
    void evaluate() {
        x.clear();
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'A' -> x.add(UpperCase.A(val, c_));
                case 'B' -> x.add(UpperCase.B(val, c_));
                case 'C' -> x.add(UpperCase.C(val, c_));
                case 'D' -> x.add(UpperCase.D(val, c_));
                case 'E' -> x.add(UpperCase.E(val, c_));
                case 'F' -> x.add(UpperCase.F(val, c_));
                case 'G' -> x.add(UpperCase.G(val, c_));
                case 'H' -> x.add(UpperCase.H(val, c_));
                case 'I' -> x.add(UpperCase.I(val, c_));
                case 'J' -> x.add(UpperCase.J(val, c_));
                case 'K' -> x.add(UpperCase.K(val, c_));
                case 'L' -> x.add(UpperCase.L(val, c_));
                case 'M' -> x.add(UpperCase.M(val, c_));
                case 'N' -> x.add(UpperCase.N(val, c_));
                case 'O' -> x.add(UpperCase.O(val, c_));
                case 'P' -> x.add(UpperCase.P(val, c_));
                case 'Q' -> x.add(UpperCase.Q(val, c_));
                case 'R' -> x.add(UpperCase.R(val, c_));
                case 'S' -> x.add(UpperCase.S(val, c_));
                case 'T' -> x.add(UpperCase.T(val, c_));
                case 'U' -> x.add(UpperCase.U(val, c_));
                case 'V' -> x.add(UpperCase.V(val, c_));
                case 'W' -> x.add(UpperCase.W(val, c_));
                case 'X' -> x.add(UpperCase.X(val, c_));
                case 'Y' -> x.add(UpperCase.Y(val, c_));
                case 'Z' -> x.add(UpperCase.Z(val, c_));
                case '0' -> x.add(Digits.zero(val, c_));
                case '1' -> x.add(Digits.one(val,  c_));
                case '2' -> x.add(Digits.two(val,  c_));
                case '3' -> x.add(Digits.three(val,c_));
                case '4' -> x.add(Digits.four(val, c_));
                case '5' -> x.add(Digits.five(val, c_));
                case '6' -> x.add(Digits.six(val,  c_));
                case '7' -> x.add(Digits.seven(val,c_));
                case '8' -> x.add(Digits.eight(val,c_));
                case '9' -> x.add(Digits.nine(val, c_));
                case ' ' -> x.add(UpperCase.space(val));
                case ':' -> x.add(Digits.colon(val));
            }
        }
    }

    void merges() {
        int r = 0, l = 0;
        ab = new String[val][2 * val * x.size()];
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < ab[0].length; j++) {
                String[][] k = x.get(r);
                ab[i][j] = k[i][l];
                if ((j + 1) % (val * 2) == 0) {
                    l = 0;
                    r++;
                } else l++;
            }
            r = 0;
        }
    }

    void _print() {
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < ab[0].length; j++) {
                System.out.print(ab[i][j] + " ");
                if ((j + 1) % (val * 2) == 0) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
