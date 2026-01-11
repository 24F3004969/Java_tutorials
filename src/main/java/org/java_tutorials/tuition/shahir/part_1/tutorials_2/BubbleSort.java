package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        var a=random_array(10);
        boolean flag=false;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                   if(a[j+1]<a[j]){
                       int t=a[j];
                       a[j]=a[j+1];
                       a[j+1]=t;
                       flag=true;
                   }
            }
            if(!flag)
                break;
            else flag=false;
        }
        System.out.println(Arrays.toString(a));
    }
    static int [] random_array(int n){
        var x=new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=(int)(Math.random()*Math.random()*n+1);
        }
        return x;
    }
}
