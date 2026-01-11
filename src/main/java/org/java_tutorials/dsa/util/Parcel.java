package org.java_tutorials.dsa.util;

import java.util.Scanner;

public class Parcel {
    public void calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the mass in gram");
        int mass = in.nextInt();
        double charger = 0.0;
        if (mass <= 500)
            charger = 500;
        else
            charger = 500 + (mass - 500) / 200.0 * 25;
        System.out.println("Total charge = " + charger);
    }
}
