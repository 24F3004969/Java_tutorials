package org.java_tutorials.tuition.shahir.part_1.tutorials_14;


public class HelloWorld {
    public static void main(String[] args) {
        for (double i = 0; i < 13135465.3245; i = i + 0.35) {
            System.out.println(Math.log(i) + "       " + ln(i));
        }
    }

    private static double ln(double n) {
        double[] zx = base_pow(n);
        double x = (zx[0] - 1) / (zx[0] + 1);
        double s = 0.0;
        for (int i = 0; i <= 100; i++) {
            s = s + pow(x, 2 * i + 1) / (2 * i + 1);
        }

        return 2 * s + zx[1] * 2.302585092994046;
    }

    public static double pow(double a, int b) {
        double p = 1;
        double k = a;
        while (b >= 1) {
            if (b % 2 == 0) {
                k = k * k;
                b = b / 2;
            } else {
                p = p * k;
                b--;
            }
        }
        return p;
    }

    private static double[] base_pow(double x) {
        double[] base_p = new double[2];
        String s = "" + x;
        if (s.contains("E")) {
            base_p[0] = Double.parseDouble(s.substring(0, s.indexOf('E')));
            base_p[1] = Double.parseDouble(s.substring(s.indexOf('E') + 1));
        } else {
            base_p[1] = s.substring(0, s.indexOf('.')).length() - 1;
            base_p[0] = Double.parseDouble(s.charAt(0) + "." +
                    s.substring(1, s.indexOf('.')) + s.substring(s.indexOf('.') + 1));
        }
        return base_p;
    }


    private static void make() {
        double a = 54654653216546849876544654654.0;
        System.out.println(a);
        double x = 0.324654654;
        double s = 0.0;
        double p = 1;
        for (int i = 0; i <= 50; i++) {
            for (int j = 1; j <= i; j++) {
                p = p * j;
            }
            double v = Math.pow(x * Math.log(a), i) / p;
            s = s + v;
            System.out.println(v);
            p = 1;
        }
        System.out.println(s);
        for (int i = 1; i <= 1000; i++) {
            System.out.println(ln(i) + "           " + Math.log(i));
        }
    }

    void pattern() {
        for (int i = 5; i >= 1; i--) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++)
                    System.out.print(j);
            } else {
                for (int j = i; j >= 1; j--)
                    System.out.print(j);
            }
            System.out.println();
        }
    }

}
