package org.java_tutorials.dsa.algorithm;

public class tree {
    public static void main(String[] args) throws InterruptedException {
        int a = 6, b = 6;
        String[][] data = {{" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 "},
                {" 7 ", " 8 ", " 9 ", " 10 ", " 11 ", " 12 "},
                {" 13 ", " 14 ", " 15 ", " 16 ", " 17 ", " 18 "},
                {" 19 ", " 20 ", " 21 ", " 22 ", " 23 ", " 24 "},
                {" 25 ", " 26 ", " 27 ", " 28 ", " 29 ", " 30 "},
                {" 31 ", " 32 ", " 33 ", " 34 ", " 35 ", " 36 "}};
        while (true) {
            int M = a, N = b;
            int x = a, y = b;
            int k_1 = 0, k_2 = 0;
            //print_array(data);
            while (M > 1 && N > 1) {
                rectangle(data, k_1, k_2, x, y);
                k_1++;
                k_2++;
                x--;
                y--;
                M = M - 2;
                N = N - 2;
            }
            System.out.print("\u001b[H");
            print_array(data);
            Thread.sleep(100);
        }
    }

    static void print_array(String[][] data) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(data[i][j].trim() + " ".repeat(6 - data[i][j].trim().length()));
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rectangle(String[][] ar, int k1, int k2, int x, int y) {
        int i, j, l, m;
        String tem1, tem2;
        tem1 = ar[k1][k2];
        ar[k1][k2] = ar[k1][k2 + 1];
        i = k2 + 1;
        while (i < y) {
            tem2 = ar[i][k1];
            ar[i][k1] = tem1;
            tem1 = tem2;
            i++;
        }
        i--;
        j = k1 + 1;
        while (j < x) {
            tem2 = ar[i][j];
            ar[i][j] = tem1;
            tem1 = tem2;
            j++;
        }
        j--;
        l = y - 2;
        while (l > k2) {
            tem2 = ar[l][j];
            ar[l][j] = tem1;
            tem1 = tem2;
            l--;
        }
        m = x - 1;
        while (m > k1) {
            tem2 = ar[l][m];
            ar[l][m] = tem1;
            tem1 = tem2;
            m--;
        }
    }
}
