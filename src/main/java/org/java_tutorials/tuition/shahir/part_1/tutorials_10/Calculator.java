package org.java_tutorials.tuition.shahir.part_1.tutorials_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> Memory = new ArrayList<>();
        int sign = 1;
        ArrayList<Integer> divisionOperator = new ArrayList<>();
        ArrayList<Integer> multiplicationOperator = new ArrayList<>();
        ArrayList<Integer> powerOperator = new ArrayList<>();
        String ConsoleValue;
        double FinalValue = 0.0;
        System.out.println("Welcome to console calculator");
        System.out.println("This calculator can do addition,multiplication,division,and can solve single expression");
        System.out.println("Example : 2+3*8/79/2*986554-6652221+0.33263^965565+985/85455565+0.3265*56656+5*-6525252");
        String tem = "";
        do {
            System.out.println("Enter a expression");
            ConsoleValue = in.nextLine() + "+";
            for (int i = 0; i < ConsoleValue.length(); i++) {
                boolean condition = ConsoleValue.charAt(i) == '-' || ConsoleValue.charAt(i) == '+';
                if (ConsoleValue.charAt(i) == '-')
                    sign = sign * (-1);
                if (ConsoleValue.charAt(i) == '+')
                    sign = 1;
                if ((Character.isDigit(ConsoleValue.charAt(i)) || ConsoleValue.charAt(i) == '.')) {
                    tem = tem + ConsoleValue.charAt(i);
                    if (tem.length() == 1)
                        tem = String.valueOf(Long.parseLong(tem) * sign);
                    sign = 1;
                }
                if (condition) {
                    if (!tem.equals("")) {
                        Memory.add(Double.parseDouble(tem));
                        tem = "";
                    }
                }
                if (ConsoleValue.charAt(i) == '/') {
                    sign = 1;
                    if (!tem.equals("")) {
                        Memory.add(Double.valueOf(tem));
                        tem = "";
                    }
                    divisionOperator.add(Memory.size() - 1);
                }
                if (ConsoleValue.charAt(i) == '*') {
                    sign = 1;
                    if (!tem.equals("")) {
                        Memory.add(Double.valueOf(tem));
                        tem = "";
                    }
                    multiplicationOperator.add(Memory.size() - 1);
                }
                if (ConsoleValue.charAt(i) == '^') {
                    sign = 1;
                    if (!tem.equals("")) {
                        Memory.add(Double.valueOf(tem));
                        tem = "";
                    }
                    powerOperator.add(Memory.size() - 1);
                }
            }
            System.out.println(Memory);
            for (int j = 0; j < powerOperator.size(); j++) {
                Memory.set(powerOperator.get(j), Math.pow(Memory.get(powerOperator.get(j)), (Memory.get(powerOperator.get(j) + 1))));
                Memory.remove(powerOperator.get(j) + 1);
                for (int b = 0; b < powerOperator.size(); b++) {
                    if ((powerOperator.get(j)) < powerOperator.get(b))
                        powerOperator.set(b, (powerOperator.get(b) - 1));
                }
                for (int a = 0; a < divisionOperator.size(); a++) {
                    if ((powerOperator.get(j)) < divisionOperator.get(a))
                        divisionOperator.set(a, (divisionOperator.get(a) - 1));
                }
                for (int b = 0; b < multiplicationOperator.size(); b++) {
                    if ((powerOperator.get(j)) < multiplicationOperator.get(b))
                        multiplicationOperator.set(b, (multiplicationOperator.get(b) - 1));
                }
            }
            for (int i = 0; i < divisionOperator.size(); i++) {
                Memory.set(divisionOperator.get(i), Memory.get(divisionOperator.get(i)) / Memory.get(divisionOperator.get(i) + 1));
                Memory.remove(divisionOperator.get(i) + 1);
                for (int a = 0; a < divisionOperator.size(); a++) {
                    if ((divisionOperator.get(i)) < divisionOperator.get(a))
                        divisionOperator.set(a, (divisionOperator.get(a) - 1));
                }
                for (int b = 0; b < multiplicationOperator.size(); b++) {
                    if ((divisionOperator.get(i)) < multiplicationOperator.get(b))
                        multiplicationOperator.set(b, (multiplicationOperator.get(b) - 1));
                }
            }
            for (int j = 0; j < multiplicationOperator.size(); j++) {
                Memory.set(multiplicationOperator.get(j), Memory.get(multiplicationOperator.get(j)) * Memory.get(multiplicationOperator.get(j) + 1));
                Memory.remove(multiplicationOperator.get(j) + 1);
                for (int b = 0; b < multiplicationOperator.size(); b++) {
                    if ((multiplicationOperator.get(j)) < multiplicationOperator.get(b))
                        multiplicationOperator.set(b, (multiplicationOperator.get(b) - 1));
                }
            }

            for (Double aDouble : Memory) FinalValue = FinalValue + aDouble;
            System.out.println("Answer : " + FinalValue);
            FinalValue = 0;
            multiplicationOperator.clear();
            divisionOperator.clear();
            powerOperator.clear();
            tem = "";
            Memory.clear();
        }
        while (!ConsoleValue.equals("exit+"));
    }
}
