package org.java_tutorials.tuition.shahir.part_1.tutorials_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation_Combination {
    private static int time,c=0;
    public static void main(String[] args) {
        double fac1 = 1.0, fac2 = 1.0, Value = 1.0;
        var Condition = 0;
        Permutation_Combination find = new Permutation_Combination();
        Scanner in = new Scanner(System.in);
        ArrayList<String> Data = new ArrayList<>();
        ArrayList<Integer> DigitHolder = new ArrayList<>();
        ArrayList<String> NumberHolder = new ArrayList<>();
        ArrayList<String> DataHolder = new ArrayList<>();
        System.out.println("Enter the total number of Element in your Data");
        int Size = in.nextInt();
        System.out.println("Enter your Data");
        for (int i = 0; i <= Size; i++) {
            Data.add(i, in.nextLine());
        }
        System.out.println("Enter the number of Element you want to choose from your data");
        int SizeLimit = in.nextInt();
        for (int i = 1; i <= Size; i++) {
            fac1 = fac1 * i;
            if (i <= (Size - SizeLimit))
                fac2 = fac2 * i;
        }
        var FinalValue = "";
        while (Value <= (fac1 / fac2)) {
            Condition = 1;
            while (Condition <= SizeLimit) {
                int digit = (int) (Math.random() * Size) + 1;
                if (!DigitHolder.contains(digit)) {
                    DigitHolder.add(digit);
                    Condition++;
                }
            }
            if (!NumberHolder.contains(DigitHolder.toString())) {
                NumberHolder.add(DigitHolder.toString());
                for (int j = 0; j < SizeLimit; j++)
                    FinalValue = FinalValue + Data.get(DigitHolder.get(j));
                if (!DataHolder.contains(FinalValue) && FinalValue.charAt(0) != '0') {
                    System.out.println(FinalValue);
                    time++;
                }
                DataHolder.add(FinalValue);
                FinalValue = "";
                Value++;
            }
            DigitHolder.clear();
        }
        System.out.println("The possible permutation of your data is : " + time);
        find.Problems(DataHolder);
    }

    private void Problems(ArrayList<String> receivedData)
    {
        int Number, Value, Ascending = 0,Descending=0, NoOrder=0,
                Two=0,Three=0,Four=0,Five=0,Six=0,Seven=0,Eight=0,
                Nine=0,Ten=0,Eleven=0,Prime=0;
        for (String receivedDatum : receivedData)
        {
            Number = Integer.parseInt(receivedDatum);
            /*
            Value = Number;
            while (Value > 9) {
                if ((Value % 10) - ((Value % 100) / 10) < 0)
                    break;
                else
                    Value = Value / 10;
            }
            if (Value < 9)
                Ascending++;

            Value = Number;
            while (Value > 9) {
                if ((Value % 10) - ((Value % 100) / 10) > 0)
                    break;
                else
                    Value = Value / 10;
            }
            if (Value < 9)
                Descending++;
            NoOrder=time-(Ascending+Descending);
             */
            if (Number%2==0)
                Two++;
            if (Number%3==0)
                Three++;
            if (Number%4==0)
                Four++;
            if (Number%5==0)
                Five++;
            if (Number%6==0)
                Six++;
            if (Number%7==0)
                Seven++;
            if (Number%8==0)
                Eight++;
            if (Number%9==0)
                Nine++;
            if (Number%10==0)
                Ten++;
            if (Number%11==0)
                Eleven++;
            int Counter=0;
            for (int i=1;i<=Number;i++)
                if (Number%i==0)
                    Counter++;
                if (Counter==2)
                    Prime++;
           c++;
        }
        System.out.println("Number with digit in Ascending = "+Ascending);
        System.out.println("Number with digit in Descending = "+Descending);
        System.out.println("Number with digit in no order = "+NoOrder);
        System.out.println("Number that are prime = "+Prime);
        System.out.println("Factor of 2 = "+Two);
        System.out.println("Factor of 3 = "+Three);
        System.out.println("Factor of 4 = "+Four);
        System.out.println("Factor of 5 = "+Five);
        System.out.println("Factor of 6 = "+Six);
        System.out.println("Factor of 7 = "+Seven);
        System.out.println("Factor of 8 = "+Eight);
        System.out.println("Factor of 9 = "+Nine);
        System.out.println("Factor of 10 = "+Ten);
        System.out.println("Factor of 11 = "+Eleven);
        System.out.println(c);
    }
}