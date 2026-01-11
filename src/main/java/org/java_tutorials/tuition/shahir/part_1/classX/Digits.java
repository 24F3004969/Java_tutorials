package org.java_tutorials.tuition.shahir.part_1.classX;

public class Digits {
    public static void main(String[] args) {
        int x = 465778, t, c = 0;
        for (int i = 9; i >= 0; i -= 1) {
            t = x;
            c = 0;
            while (t > 0) {
                int r = t % 10;
                if (r == i)
                    c++;
                t /= 10;
            }
            if (c >= 2){
                System.out.println("digit repeat");
                break;
            }

        }

    }
}
