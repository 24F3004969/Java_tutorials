package org.java_tutorials.tuition.shahir.part_1.mosha;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.print(1);
        for (int i = 2; i <= 100; i++) {
            int c = 0;
            int n = i;
            int k = 2;
            while (k <= n) {
                while (n % k == 0) {
                    n = n / k;
                }
                if (k != 2 && k != 3 && k != 5) {
                    c = 1;
                    break;
                }
                k++;
            }
            if (c == 0)
                System.out.print("," + i);

        }
    }
}
