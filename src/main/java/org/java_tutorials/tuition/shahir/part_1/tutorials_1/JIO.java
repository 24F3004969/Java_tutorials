package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
Question 2
JIO telecommunications wishes to compute monthly telephone bills
  for its customers using
the following rules on the basis of calls made :
Number of calls Rate
First 80 calls Rs. 250
Next 80 calls Rs. 3/call
Next 160 calls Rs. 2/call
calls above 280 calls Rs. 1/call
Enter numbers of calls made and calculate the amount to be paid.
 */
public class JIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of calls made");
        int No_call = scanner.nextInt();
        double rate = 0.0;
        if (No_call <= 80)
            rate = 250;
        if (No_call > 80 && No_call <= 160)
            rate = 250 + (No_call - 80) * 3;
        if (No_call > 160 && No_call <= 320)
            rate = 250 + 80 * 3 + (No_call - 160) * 2;
        if (No_call > 320)
            rate = 250 + 80 * 3 + 160 * 2 + (No_call - 320);
        System.out.println("No of call made = " + No_call);
        System.out.println("Amount to be paid = " + rate);
    }
}
