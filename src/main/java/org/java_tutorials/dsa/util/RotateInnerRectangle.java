package org.java_tutorials.dsa.util;


public class RotateInnerRectangle {
    public static void main(String[] args)
            throws InterruptedException {
        var a = new RotateInnerRectangle();
        int size = 100;
        int[] b = new int[size / 2];
        for (int i = 1; i < size / 2; i = i + 2) {
            b[i] = i;
        }
        var x = a.randomMatrix(size, b);
        while (true) {
            for (int i = 0; i < size / 2; i++) {
                a.rotate(x, i);
            }
            Thread.sleep(50);
            System.out.print("\u001b[H");
            a.printArray(x);
        }
    }

    String[][] randomMatrix(int size, int[] b) {
        String[][] a = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char x = (char) (Math.random() * 57 + 65);
                if (!isValidPoint(b, i, j, size))
                    a[i][j] = getText("██");
                else a[i][j] = "  ";
            }
        }
        return a;
    }

    boolean isValidPoint(int[] a, int i, int j, int len) {
        for (int k = 0; k < a.length; k++) {
            if ((j >= a[k] && j <= len - 1 - a[k]) && (i >= a[k] && i <= len - 1 - a[k]))
                if ((a[k] == j || a[k] + j == len - 1 || (a[k] == i || a[k] + i == len - 1)))
                    return false;
        }
        return true;
    }

    void printArray(String[][] arr) {
        var s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                s.append(arr[i][j]);
            }
            s.append('\n');
        }
        System.out.println(s);
    }

    void rotate(String[][] a, int layer) {
        int column = a[0].length - layer - 1;
        String tem = swap_along_x(a, layer, column, layer, a[layer][layer]);
        tem = swap_along_y(a, layer, column, column, tem);
        tem = swap_along_x(a, column, layer, column, tem);
        swap_along_y(a, column, layer, layer, tem);

    }

    String swap_along_x(String[][] a, int start, int end, int y, String tem) {
        String tem1 = "";
        if (start < end) {
            for (int i = start + 1; i <= end; i++) {
                tem1 = a[y][i];
                a[y][i] = tem;
                tem = tem1;
            }
        } else {
            for (int i = start - 1; i >= end; i--) {
                tem1 = a[y][i];
                a[y][i] = tem;
                tem = tem1;
            }
        }
        return tem1;
    }

    String swap_along_y(String[][] a, int start, int end, int x, String tem) {
        String tem1 = "";
        if (start < end) {
            for (int i = start + 1; i <= end; i++) {
                tem1 = a[i][x];
                a[i][x] = tem;
                tem = tem1;
            }
        } else {
            for (int i = start - 1; i >= end; i--) {
                tem1 = a[i][x];
                a[i][x] = tem;
                tem = tem1;
            }
        }
        return tem1;
    }

    public static String getText(String s) {
        return /*Color.valueOf("" +
                        Color.values()[(int) (Math.random() * 8)])
                .getColor() + s + "\33[0m"*/getTextColor((int) (Math.random() * 8),s);
    }

    public static String getTextColor(int code, String s) {
        return "\u001b[38;5;" + code + "m" + s + "\u001b[0m";
    }

}

enum Color {
    RED("\033[0;31m"),   // RED
    GREEN("\033[0;32m"),   // GREEN
    YELLOW("\033[0;33m"),  // YELLOW
    BLUE("\033[0;34m"),    // BLUE
    PURPLE("\033[0;35m"),  // PURPLE
    CYAN("\033[0;36m"),  // CYAN
    WHITE("\033[0;97m"),  // WHITE
    CYAN_BRIGHT("\033[0;96m");
    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}

