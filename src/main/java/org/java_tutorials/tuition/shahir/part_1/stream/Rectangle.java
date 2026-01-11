package org.java_tutorials.tuition.shahir.part_1.stream;

public class Rectangle {
    public static void main(String[] args) {
        int length = 10, breadth = 6;
        for (int i = 0; i <=breadth; i++) {
            for (int j = 0; j <=length; j++) {
                if (isRectangle(j, i, length / 2, breadth / 2, length, breadth))
                //if (isRect(j,i,length,breadth))
                    System.out.print("██");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static boolean isRectangle(int x, int y, int p, int q, int w, int h) {
        int a = p - w / 2;
        int c = p + w / 2;
        int b = q - h / 2;
        int d = q + h / 2;
        return (x - a) * (y - b) * (x - c) * (y - d) >= 0;
    }

    static boolean isRect(int x, int y, int w, int h) {
        return x % w == 0 || y % h == 0;
    }
}
