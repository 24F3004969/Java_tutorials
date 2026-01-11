package org.java_tutorials.tuition.shahir.part_1.tutorials_5;


import java.io.IOException;

public class ClockAscii {
    public static void main(String[] args) throws InterruptedException, IOException {
        double R = 30, r = 24, p = R, q = 0;
        double k = 4, l = 0;
        /*while (true) {
            LocalTime localTime = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            double[] h = getCoordinate(localTime.getHour() * 5, R);
            double[] m = getCoordinate(localTime.getMinute(), R);
            double[] s = getCoordinate(localTime.getSecond(), R);
            Draw(R, r, h[0], h[1], m[0], m[1], s[0], s[1]);
            Thread.sleep(1000);
            clrscr();
        }*/
    }

    private static double[] getCoordinate(int t, double r) {
        if (t >= 0 && t <= 7) {
            return new double[]{r + (t * 4), 0};
        }
        if (t >= 8 && t <= 15) {
            return new double[]{(2 * r), (2 + (t - 8) * 4)};
        }
        if (t >= 16 && t <= 22) {
            return new double[]{(2 * r), (r + (t - 15) * 4)};
        }
        if (t >= 23 && t <= 30) {
            return new double[]{(58 - (t - 23) * 4), (2 * r)};
        }
        if (t >= 31 && t <= 37) {
            return new double[]{(r - (t - 30) * 4), (2 * r)};
        }
        if (t >= 38 && t <= 45) {
            return new double[]{(0), (58 - (t - 38) * 4)};
        }
        if (t >= 46 && t <= 52) {
            return new double[]{(0), (r - (t - 45) * 4)};
        }
        if (t >= 53 && t <= 60) {
            return new double[]{(2 + (t - 53) * 4), (0)};
        }
        return new double[0];
    }

    private static void Draw(double R, double r, double H, double h, double M, double m, double S, double s) {
        StringBuilder s1 = new StringBuilder();
        for (double i = 0; i <= 2 * R; i++) {
            for (double j = 0; j <= 2 * R; j++) {
                char x = (char) (Math.random() * 60 + 60);
                if (donut(j, i, R, r) || (i == R && j == R))
                    s1.append("██");
                else if (clock_Hands(j, i, R, r, H, h))
                    s1.append("██");
                else if (clock_Hands(j, i, R, r, M, m))
                    s1.append("██");
                else if (clock_Hands(j, i, R, r, S, s))
                    s1.append("██");
                else s1.append("  ");
            }
            s1.append('\n');
        }
        System.out.println(s1);
    }

    private static boolean circle(double x, double y, double r) {
        return (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(r, 2) - 2 * r * (x + y)) <= 0;
    }

    private static boolean donut(double x, double y, double R, double r) {
        return (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(R, 2) - 2 * R * (x + y)) <= 0
                && (Math.pow(x, 2) + Math.pow(y, 2) + 2 * Math.pow(R, 2) - 2 * R * (x + y)) >= r * r;
    }

    private static boolean clock_Hands(double x, double y, double R, double r, double p, double q) {
        if (q < R && (circle(x, y, R) && y < R)) {
            return result(x, y, R, p, q);
        }
        if (q > R && (circle(x, y, R) & y > R)) {
            return result(x, y, R, p, q);
        }
        if (q == R && x > R && p > R)
            return result(x, y, R, p, q);
        if (q == R && x < R && p < R)
            return result(x, y, R, p, q);
        if (p == R && y > R && q > R)
            return result(x, y, R, p, q);
        if (p == R && y < R && q < R)
            return result(x, y, R, p, q);
        return false;
    }

    private static boolean result(double x, double y, double R, double p, double q) {
        double slope1 = (y - R) / (x - R);
        double slope2 = (y - q) / (x - p);
        return slope1 == slope2 || (slope1 == Double.NEGATIVE_INFINITY && slope2 == Double.POSITIVE_INFINITY) ||
                (slope2 == Double.NEGATIVE_INFINITY && slope1 == Double.POSITIVE_INFINITY);
    }

    public static void clrscr() {
        System.out.print("\u001b[H");
        System.out.flush();
    }


}

