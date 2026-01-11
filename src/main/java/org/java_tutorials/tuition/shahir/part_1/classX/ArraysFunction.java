package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysFunction {
    public static void main(String[] args) {
        //single
        int a[]=new int[5];
        //double
        int b[][]=new int[3][3];
        a[3]=32;
        b[2][2]=8;
        b[0][0]=9;
        //double
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

    }

}
