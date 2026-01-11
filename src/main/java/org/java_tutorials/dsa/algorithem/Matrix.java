package org.java_tutorials.dsa.algorithem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Matrix {
    public static void main(String[] args) {
        Double [][]a=new Double[1000][1000];
        for (int x=0;x<a.length;x++){
            for (int y=0;y<a.length;y++)
                a[x][y]= (double) (int) (Math.random() * 9);
        }
        System.out.println("Filled");
        Lu_Decomposition lu_decomposition=new Lu_Decomposition(a);
        /*Double [][] q =lu_decomposition.matrix;
        Arrays.main.java.org.jmath.stream(q).forEachOrdered(doubles -> {
            IntStream.range(0, q.length).mapToObj(j -> " " + doubles[j] + "  ").forEachOrdered(System.out::print);
            System.out.println();
        });*/
        System.out.println("Decomposition has begun");
        System.out.println(lu_decomposition.decomposition());
        System.out.println("Decomposition is complete");
        Double [][] k =lu_decomposition.matrix;
        Arrays.stream(k).forEachOrdered(doubles -> {
            IntStream.range(0, k.length).mapToObj(j -> " " + doubles[j] + "  ").forEachOrdered(System.out::print);
            System.out.println();
        });
        System.out.println();
        Double[][]t=lu_decomposition.U;
        Arrays.stream(t).forEachOrdered(doubles -> {
            IntStream.range(0, t.length).mapToObj(j -> " " + doubles[j] + "  ").forEachOrdered(System.out::print);
            System.out.println();
        });
    }
}
