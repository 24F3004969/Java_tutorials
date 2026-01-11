package org.java_tutorials.tuition.shahir.part_1.tutorials_6;

import java.util.Scanner;

class EnterValue {
    double width;
    double length;
    double height;

    EnterValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length :");
        length = scanner.nextDouble();
        System.out.println("Enter width :");
        width = scanner.nextDouble();
        System.out.println("Enter height :");
        height = scanner.nextDouble();
    }
}
