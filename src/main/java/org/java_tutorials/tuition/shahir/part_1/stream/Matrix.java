package org.java_tutorials.tuition.shahir.part_1.stream;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        double[] B ={8,-11,-3};
        double[][] A = {{-2321,13,-1},{-34,-13,24},{-12,111,239}};
        GaussianElimination(A,B);
    }

    public static void GaussianElimination(double[][] mrt, double[] C) {
        int width = mrt[0].length;
        int height = mrt.length;
        for (int i = 0; i <height; i++) {
            for (int j = i+1; j < height; j++) {
                   double factor=mrt[j][i]/mrt[i][i];
                   C[j]=C[j]-factor*C[j];
                for (int k = i; k <width ; k++) {
                    mrt[j][k]=mrt[j][k]-factor*mrt[i][k];
                }
            }
        }
        System.out.println(Arrays.deepToString(mrt));
        System.out.println(Arrays.toString(C));
    }
}
