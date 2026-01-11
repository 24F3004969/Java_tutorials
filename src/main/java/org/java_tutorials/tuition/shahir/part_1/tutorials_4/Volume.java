package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
//Q 16 Pg 152
public class Volume
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("to find the volume of cuboid enter 'cuboid'");
        System.out.println("to find the volume of cylinder enter 'cylinder'");
        System.out.println("to find the volume of cone enter 'cone'");
        System.out.println("Enter your choice ");
        String choice=scanner.nextLine();
        switch (choice) {
            case "cuboid" -> {
                System.out.println("Enter the length");
                int l = scanner.nextInt();
                System.out.println("Enter the breath");
                int b = scanner.nextInt();
                System.out.println("Enter the height");
                int h = scanner.nextInt();
                System.out.println("The volume of cuboid is " + (l * b * h));
            }
            case "cylinder" -> {
                System.out.println("Enter the radius of the cylinder");
                int r = scanner.nextInt();
                System.out.println("Enter the height");
                int h = scanner.nextInt();
                System.out.println("The volume cylinder is " + (22.0 / 7 * r * r * h));
            }
            case "cone" -> {
                System.out.println("Enter the radius of the cylinder");
                int r = scanner.nextInt();
                System.out.println("Enter the height");
                int h = scanner.nextInt();
                System.out.println("The volume cylinder is " + (22.0 / 21 * r * r * h));
            }
            default -> System.out.println("Illegal term");
        }

    }
}
