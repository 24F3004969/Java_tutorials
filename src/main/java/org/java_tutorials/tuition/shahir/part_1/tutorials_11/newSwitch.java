package org.java_tutorials.tuition.shahir.part_1.tutorials_11;

import java.util.Scanner;

public class newSwitch {
    public static void main(String[] args) {
        System.out.println("Enter the day of week");
        Scanner in = new Scanner(System.in);
        String day = in.nextLine();
        switch (day) {
            case "Monday":
                System.out.println("This the first day of the week");
            case "Tuesday":
                System.out.println("This the second day of the week");
                break;
            case "Wednesday":
                System.out.println("This the third day of the week");
            case "Thursday":
                System.out.println("This the fourth day of the week");
               break;
            case "Friday":
                System.out.println("This the fifth day of the week");
                break;
            case "Saturday":
                System.out.println("This the sixth day of the week");
                break;
            case "Sunday":
                System.out.println("This the seventh day of the week");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
