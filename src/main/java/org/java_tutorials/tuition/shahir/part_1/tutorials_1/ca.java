package org.java_tutorials.tuition.shahir.part_1.tutorials_1;



import java.util.*;

public class ca {

    public static void main(String[] args){
        int num1;
        int num2;
        var in=new Scanner(System.in);
        System.out.println("oye number dal");
        num1 = Integer.parseInt(in.nextLine());
        System.out.println("oye dusra number dal");
        num2 = Integer.parseInt(in.nextLine());
        System.out.println("oye operation dal");
        String operation = in.nextLine();
        switch (operation) {
            case "+" -> System.out.println("tera answer hai  " + (num1 + num2));
            case "-" -> System.out.println("tera answer hai  " + (num1 - num2));
            case "/" -> System.out.println("tera answer hai  " + (num1 / num2));
            case "*" -> System.out.println("tera answer hai  " + (num1 * num2));
        }
    }
}