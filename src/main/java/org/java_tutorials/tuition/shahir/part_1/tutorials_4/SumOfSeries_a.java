package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// pg 209 q9
public class SumOfSeries_a
{
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    double sum=0;
        System.out.println("Enter the value of n");
        int n=scanner.nextInt();
        double f=1;
        for (int i=1;i<=n;i++){
            for (int a=1;a<=i;a++)
                f=f*a;
            sum=sum+(1/f);
        }
        System.out.println("The sum of the series is "+sum);
    }

}
