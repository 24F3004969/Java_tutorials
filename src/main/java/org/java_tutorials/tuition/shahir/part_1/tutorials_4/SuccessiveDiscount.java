package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
//Q 4 PG=102
public class SuccessiveDiscount
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the price of the article");
        double price=scanner.nextDouble();
        double D1,D2;
        System.out.println("The fist shopkeeper offer a discount of 30% so the discount and price paid by the customer is :");
        D1=price*(0.3);
        System.out.println("The discount is = "+D1);
        System.out.println("The price paid by the customer is = "+(price-D1));
        System.out.println("The second  shopkeeper offer a successive discount of 20% and 10% so the discount and price paid by the customer is :");
        D2=price*(0.2)*(0.1);
        System.out.println("The discount is = "+D2);
        System.out.println("The price paid by the customer is = "+(price-D2));
    }
}
