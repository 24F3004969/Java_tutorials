package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] num = {-20, 1, 5, 4, -16, 7, 12, 9, 59, 70};
        //int []num=randomArray(2500);
        for (int i = 1; i < num.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (num[i] < num[j]) {
                    int t = num[i];
                    for (int k = i; k > j; k--) {
                        num[k] = num[k - 1];
                    }
                    num[j]=t;
                    break;
                }
            }
        }
        //for (int i = 0; i < num.length; i++) {
           // System.out.println(num[i]);
       // }
        System.out.println(Arrays.toString(num));
    }
    private static int[] randomArray(int n) {
        int [] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=(int)(Math.random()*i*i+i);
        }
        System.out.println("The array is filled");
        return a;
    }
}
