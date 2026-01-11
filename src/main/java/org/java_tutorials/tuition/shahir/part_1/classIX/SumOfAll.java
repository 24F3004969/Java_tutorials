package org.java_tutorials.tuition.shahir.part_1.classIX;

public class SumOfAll {
    public static void main(String[] args) {
        int s = 0;
        int i = 1;
        while (i <= 10) {
            s = s + i;
            i = i + 1;
        }
        System.out.println(s);
        int sum = 0;
        int j=1;
        for (j = 1; j <= 10; j++)
        {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
