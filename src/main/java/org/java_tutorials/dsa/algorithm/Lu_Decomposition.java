package org.java_tutorials.dsa.algorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lu_Decomposition {
    Double[][] matrix;
    Double [][]L;
    Double[][]U;
    public Lu_Decomposition(Double[]... matrix) {
        this.matrix = matrix;
        L=new Double[matrix.length][matrix.length];
        U=new Double[matrix.length][matrix.length];
    }
    Double[][] getUnit_matrix()
    {
        Double [][] unit = new Double[matrix.length][matrix.length];
        int i = 0;
        while (i < matrix.length) {
            int j = 0;
            while (j < matrix.length) {
                if (i == j)
                    unit[i][j] = 1.0;
                else
                    unit[i][j] = 0.0;
                j++;
            }
            i++;
        }
        return unit;
    }
    Double[][] dot_product(Double[][] a,Double[][]b){
        Double [][]product=new Double[a.length][a.length];
        IntStream.range(0, b.length).forEachOrdered(i -> {
            int position = Arrays.asList(a[i]).indexOf(1.0);
            product[i] = b[position];
        });
        return product;
    }
    Double [][] pivot()
    {
        Double [][]unit=getUnit_matrix();
        for (int i=0;i<unit.length;i++)
        {
            double max=matrix[i][i];
            int pos=i;
            for (int j=i;j<unit.length;j++){
                if (matrix[j][i]>max){
                    max=matrix[j][i];
                    pos=j;
                }
            }
            Double []tem;
             if (pos!=i)
             {
                 tem=unit[pos];
                 unit[pos]=unit[i];
                 unit[i]=tem;
             }
        }
        return unit;
    }
    boolean decomposition()
    {
        matrix=dot_product(pivot(),matrix);
        for (int i=0;i<matrix.length;i++){
            for (int j=i;j<matrix.length;j++){
                  U[i][j]=getU(i,j);
                  if (i==j)
                  L[j][i]=1.0;
                  else L[j][i]=getL(j,i);
            }
        }
        return true;
    }
    double getU(int i,int j){
        double sum=matrix[i][j];
        for (int k=0;k<i;k++){
            sum=sum-(U[k][j]*L[i][k]);
        }
        return sum;
    }
    double getL(int i,int j){
        double sum=matrix[i][j];
        for (int k=0;k<j;k++){
            sum=sum-(U[k][j]*L[i][k]);
        }
        return sum/U[j][j];
    }
}
