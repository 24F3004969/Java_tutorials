package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

public class SumOfSeries_e
{
    //pg 209 q9
    public static void main(String[] args) {
        double sum=0.0;
        for (double i=2;i<=29;i++)
            sum=sum+(1/i);
        System.out.println("The sum of series is "+sum);
    }
}
