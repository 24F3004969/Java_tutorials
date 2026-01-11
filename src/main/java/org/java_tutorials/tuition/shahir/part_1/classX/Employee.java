package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int BP;
        double DA, HRA, PF, GP, NET_PAY;
        System.out.println("Enter basic pay");
        BP = in.nextInt();
        DA = 30.0 / 100 * BP;
        HRA = 15.0 / 100 * BP;
        PF = 12.5 / 100 * BP;
        GP = BP + DA + HRA;
        NET_PAY = GP - PF;
        System.out.println("basic pay = "+BP);
        System.out.println("Dearness Allowance "+DA);
        System.out.println("HRH ="+HRA);
        System.out.println("Provident fund "+PF);
        System.out.println("Gross pay "+GP);
        System.out.println("Net pay = "+NET_PAY);
    }
}
