package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// pg 188 q 2
public class Count
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 50 numbers");
        int countPositive=0,countNegative=0,sumPositive=0,sumNegative=0;
        for (int i=1;i<=50;i++){
            System.out.println("Enter the "+i+" number");
            int n=scanner.nextInt();
            if(n>0){
                countPositive++;
                sumPositive=sumPositive+n;
            }
            if(n<0){
                countNegative++;
                sumNegative=sumNegative+n;
            }
        }
        System.out.println("Number of positive integers are "+countPositive);
        System.out.println("Number of negative integers are "+countNegative);
        System.out.println("The sum of all positive integer are = "+sumPositive);
        System.out.println("The sum of all negative integers are "+sumNegative);
    }
}
