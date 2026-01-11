package org.java_tutorials.dsa.algorithm;


import java.util.Arrays;

public class Binary_sort {
    public static void main(String[] args) {
        int[] b = randomArray(100000);
        tree_sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println("ddd");
    }
    private static void  tree_sort(int[] a){
          int [][] dummy=new int[2*a.length][];
          int start=a.length,end=a.length;
        dummy[start]=new int[]{a[0]};
        for (int i = 1; i < a.length; i++) {
            if (dummy[start][0]>a[i]){
                start--;
                dummy[start]=new int[]{a[i]};
            }
            else if (dummy[end][0]<a[i]){
                end++;
                dummy[end]=new int[]{a[i]};
            }
        }
        //System.out.println(Arrays.deepToString(dummy));


    }
    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            int con = (int) (Math.random() * (n - j) + 2);
            a[j] = con;
        }
        System.out.println("Array is filled");
       return a;
    }

}
