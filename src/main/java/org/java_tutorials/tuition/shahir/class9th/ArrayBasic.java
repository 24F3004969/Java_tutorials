package org.java_tutorials.tuition.shahir.class9th;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int []a=new int[10];
        int []b={15,19};
        int x=5,y=15;
        x=y;
        System.out.println("x= "+x+"  y= "+y);
        x=25;
        System.out.println("x= "+x+"  y= "+y);
        b=a;
        b[0]=-9;
        System.out.println("b= "+Arrays.toString(b));
        System.out.println("a= "+Arrays.toString(a));
    }
}
