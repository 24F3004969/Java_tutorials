package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// Q 11 PG 151
public class HypotheticalTable
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name ");
        String name=scanner.nextLine();
        System.out.println("Enter the age");
        int age=scanner.nextInt();
        System.out.println("Enter your taxable income ");
        int income=scanner.nextInt();
        double tax=0.0;
        if (age<60){
            if (income<=250000)
                tax=0.0;
            if (income>250000&&income<=500000)
                tax=(income-160000)*0.1;
            if (income>500000&&income<=1000000)
                tax=(income-500000)*0.2+34000;
            if (income>1000000)
                tax=(income-1000000)*0.3+94000;
        }
        else
            System.out.println("Wrong Category");
        System.out.println("Your name is "+name);
        System.out.println("Your income is "+income);
        System.out.println("Your income tax is "+tax);
    }
}
