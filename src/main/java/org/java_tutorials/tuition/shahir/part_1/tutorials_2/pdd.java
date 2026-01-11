package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

import java.util.*;

class pdd {
    public static void main(String []args) {
        Scanner in=new Scanner(System.in);
        int i=1;
        int max=0;
        while(i<=10){
            System.out.println("Enter the "+i+" th number");
            int n=in.nextInt();
            if(n>max)
                max=n;
            i++;
        }
        System.out.println(max);
    }
}