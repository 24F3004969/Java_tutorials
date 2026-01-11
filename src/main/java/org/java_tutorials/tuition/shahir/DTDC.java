package org.java_tutorials.tuition.shahir;

import java.util.Scanner;

public class DTDC {
    String item_name;
    int weight;
    String address;
    double cost;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the item");
        item_name = sc.nextLine();
        System.out.println("Enter the weight of the item");
        weight = sc.nextInt();
        System.out.println("Enter the address of the item");
        address = sc.nextLine();
    }

    void cal() {
        if (weight <= 500)
            cost = 5 * weight;
        else if (weight <= 1000)
            cost = 500 * 5 + (weight - 500) * 3;
        else
            cost = 500 * 5 + 500 * 3 + (weight - 1000) * 2;
    }

    void display() {

    }
}
