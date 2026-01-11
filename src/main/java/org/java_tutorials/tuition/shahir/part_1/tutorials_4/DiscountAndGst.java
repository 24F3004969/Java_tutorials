package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
//  Q3 pg=102
public class DiscountAndGst
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the printed price of the Digital Camera");
        double price=scanner.nextDouble();
        double Amt;
        Amt=price-(0.1*price);
        Amt=Amt+(0.06*Amt);
        System.out.println("The price to paid by the customer = "+Amt);
    }
}
