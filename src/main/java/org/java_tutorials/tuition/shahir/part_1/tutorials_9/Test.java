package org.java_tutorials.tuition.shahir.part_1.tutorials_9;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the operator");
        char sign=scanner.nextLine().charAt(0);
        System.out.println("Enter the first number");
        int a=scanner.nextInt();
        System.out.println("Enter the second number");
        int b=scanner.nextInt();
        switch (sign)
        {
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            default: System.out.println("Wrong operator");
        }
    }
}
