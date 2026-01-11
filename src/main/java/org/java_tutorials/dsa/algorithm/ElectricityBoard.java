package org.java_tutorials.dsa.algorithm;

import java.util.*;

public class ElectricityBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unit;
        double charge;
        System.out.println("Enter the unit consumed");
        unit = in.nextInt();
        if (unit <= 100)
            charge = unit * 1.80;
        else if (unit > 100 && unit <= 300)
            charge = 100 * 1.80 + (unit - 100) * 2.30;
        else if (unit > 300 && unit <= 500)
            charge = 100 * 1.80 + 200 * 2.30 + (unit - 300) * 2.80;
        else
            charge = 100 * 1.80 + 200 * 2.30 + 200 * 2.80 + (unit - 500) * 3.50;
        System.out.println("Amount to be paid is = "+charge);
    }

}
