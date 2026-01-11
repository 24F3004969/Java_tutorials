package org.java_tutorials.tuition.shahir.part_1.tutorials_12;

import java.util.Scanner;

public class max
{
    public static  void main(String []args){
        Scanner in=new Scanner(System.in);
        int []number=new int[10];
        int maxValue=0,minValue=0;
        System.out.println("Enter a set of 10 numbers one by one");
        for(int i=0;i<=9;i++){
            number[i]=in.nextInt();
            if (i==0){
            maxValue=number[0];
            minValue=number[0];
            }
            maxValue=Math.max(maxValue,number[i]);
            minValue=Math.min(minValue,number[i]);
        }
        System.out.println("The maximum of the set of numbers is :"+maxValue);
        System.out.println("The minimum of the set of numbers is :"+minValue);
    }
}
