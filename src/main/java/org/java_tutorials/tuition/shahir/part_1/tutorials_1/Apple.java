package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
Question 3.
Apple Inc. has announced the following festival discounts on the purchase of IPhones, based
on the total cost of the mobile purchased :
Total cost Discount (in percentage)
Less than 30000 5%
30001 to 40000 10 %
40001 to 55000 12.5 %
More than 55000 15 %
Write a program to input the total cost and compute & display the amount to be paid by the
customer after availing the discount.
 */
public class Apple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of purchase");
        int amount = scanner.nextInt();
        double D = 0.0;
        if (amount <= 30000)
            D = 0.05 * amount;
        if (amount >= 30001  && amount <=40000)
            D = 0.1 * amount;
        if (amount >=40001 && amount <= 55000)
            D = 0.125 * amount;
        if (amount >  55000)
            D = 0.15 * amount;
        System.out.println("Net amount to be paid =" + (amount - D));
    }
}
