package org.java_tutorials.dsa.algorithem;

import java.util.Arrays;
import java.util.List;

public class arrayToTree {
    public static void main(String[] args) {
        Integer []a=new Integer[100];
        Double [][]b={{1.0,2.0,4.0},{1.0,2.0,4.0}};
        List<Double> list=Arrays.asList(b[0]);
        System.out.println(list.size()+" "+b.length);
        Arrays.setAll(a, i -> i+1);

        Arrays.sort(a);
        Arrays.stream(a).forEach(System.out::println);
        System.out.println(Arrays.binarySearch(a,9839));
        System.out.println("done");
    }
}
