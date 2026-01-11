package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
    int []a={1,5441,987897,368,657,0};
    int []b={2131,6544,987798,231987,321458544,0,3215205,544564};
    int []c=merge(new int[][]{a,b});
    System.out.println(Arrays.toString(c));
    }
    public static int [] merge(int [][]x){
        int []c=new int[findSize(x)];
        int i = 0;
        while (i < c.length) {
            for (int j = 0; j < x.length; j++) {
                for (int k = 0; k < x[j].length; k++)
                {
                    c[i]=x[j][k];
                    i++;
                }
            }
        }
        return c;
    }

    private static int findSize(int[][] x) {
        int sum=0;
        for (int i = 0; i < x.length; i++) {
            sum=sum+x[i].length;
        }
        return sum;
    }
}
