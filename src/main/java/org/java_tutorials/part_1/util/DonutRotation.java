package org.java_tutorials.part_1.util;

import java.util.*;


public class DonutRotation {
    public static void main(String[] args) throws InterruptedException {
        int k;
        double A = 0, B = 0;
        int w = 700;
        int h = 500;
        int size = h * w;
        double[] z = new double[size];
        char[] b = new char[size];
        while (true) {
            Arrays.fill(b, 0, size, ' ');
            Arrays.fill(z, 0, size, 0);
            init_frame(w, h, A, B, z, b);

            A += 0.08;
            B += 0.04;
            System.out.print(draw_frames(b, w, h));
            Thread.sleep(30);
        }
    }

    private static void init_frame(int width, int height, double A, double B, double[] _dbuff, char[] _cbuff) {
        double K1 = width * 5 * 3 / (24 * 1.5);
        for (double j = 0; 6.28 > j; j += 0.07) {
            for (double i = 0; 6.28 > i; i += 0.02) {
                double c = Math.sin(i),
                        d = Math.cos(j),
                        e = Math.sin(A),
                        f = Math.sin(j),
                        g = Math.cos(A),
                        h = d + 2,
                        D = 1 / (c * h * e + f * g + 5),
                        l = Math.cos(i),
                        m = Math.cos(B),
                        n = Math.sin(B),
                        t = c * h * g - f * e;
                int x = (int) (width / 2 + K1 * D * (l * h * m - t * n)),
                        y = (int) (height / 2 + K1 / 2 * D * (l * h * n + t * m)),
                        o = x + width * y,
                        N = (int) (8 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n));
                if (height > y && y > 0 && x > 0 && width > x && D > _dbuff[o]) {
                    _dbuff[o] = D;
                    _cbuff[o] = new char[]{'.', ',',
                            '-', '~', ':',
                            ';', '=', '!',
                            '*', '#', '$', '@'}[Math.max(N, 0)];
                }
            }
        }
    }

    private static String draw_frames(char[] _cbuff, int width, int height) {
        System.out.print("\u001b[H");
        StringBuilder st = new StringBuilder();
        for (int k = 0; width * height >= k; k++)
            st.append(k % width > 0 ? _cbuff[k] : 10);
        return st.toString();
    }

}