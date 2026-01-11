package org.java_tutorials.dsa.algorithm;

import java.io.IOException;

public class Lines {
    public static void main(String[] args) throws IOException, InterruptedException {
        int slope = 1;
        int x = -10, y = -10;
        while (true) {
            x = (int) (Math.random() * 80 - 1);
            y = (int) (Math.random() * 30 - 1);
            draw_line(80, 30, x, y, slope);
            Thread.sleep(200);
            cls();
            slope = (int) (Math.random() * 2 - 1);
        }
    }

    private static void cls() throws IOException, InterruptedException {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }

    static void draw_line(int xLimit, int yLimit, int x, int y, double slope) {
        x = x + xLimit / 2;
        y = y + yLimit / 2;
        StringBuilder str = new StringBuilder();
        String ch = (slope < 0) ? "/" : "\\";
        if (slope == 0)
            ch = "-";
        if (Double.isNaN(slope))
            ch = "|";
        for (int i = 1; i <= yLimit; i++) {
            for (int j = 1; j <= xLimit; j++) {
                if (j == xLimit / 2)
                    str.append("|");
                else if (i == yLimit / 2)
                    str.append("-");
                else if ((Double.isNaN(slope) && j == x) || (i - y) == slope * (j - x))
                    str.append(ch);
                else
                    str.append(" ");
            }
            str.append("\n");
        }
        System.out.println(str);
    }
}
