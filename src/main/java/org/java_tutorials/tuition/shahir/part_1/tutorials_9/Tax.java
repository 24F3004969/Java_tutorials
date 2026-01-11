package org.java_tutorials.tuition.shahir.part_1.tutorials_9;

import java.util.Scanner;

public class Tax
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the income");
        int income=in.nextInt();
        double tax;
        if(income<2_50_000)
            tax=0.0;
        else if(income>2_50_000 && income<=5_00_000)
            tax=0.05*income;
        else if(income>=5_00_001 && income<=10_00_000)
            tax=0.1*income;
        else tax=0.15*income;
        System.out.println("Tax to pay is = "+tax);

    }
}
