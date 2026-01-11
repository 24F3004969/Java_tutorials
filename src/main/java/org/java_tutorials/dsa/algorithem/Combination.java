package org.java_tutorials.dsa.algorithem;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/*
My approach to solve this problem:
     # First i ask the user to enter the data in string format
     #Then i ask the number of elements for the data that he/she want to permuted(because every it is not necessary to permute the full elements)
     #Then i find the permutations using the method permutationValue.
 */
public class Combination
{
    public static void main(String[] args)
    {
        double Value = 1.0;
        var Size = 0;
        Scanner in = new Scanner(System.in);
        StringBuilder FinalValue = new StringBuilder();
        LinkedList<Integer> DigitHolder = new LinkedList<>();
        HashSet<String> NumberHolder = new HashSet<>();
        HashSet<String> DataHolder = new HashSet<>();
        System.out.println("Enter your Data");
        String Data = in.nextLine();
        System.out.println("Enter the number of Element you want to choose from your data");
        int SizeLimit = in.nextInt();
        while (Value <= permutationValue(Data, SizeLimit))
        {
            Size = 1;
            while (Size <= SizeLimit) {
                int digit = (int) (Math.random() * Data.length());
                if (!DigitHolder.contains(digit)) {
                    DigitHolder.add(digit);
                    Size++;
                }
            }
            Collections.sort(DigitHolder);
            if (!NumberHolder.contains(DigitHolder.toString()))
            {
                NumberHolder.add(DigitHolder.toString());
                for (int j = 0; j < SizeLimit; j++) {
                    FinalValue.append(Data.charAt(DigitHolder.get(j)));
                }

                if (!DataHolder.contains(FinalValue.toString())) {
                    System.out.print(FinalValue+"   ");
                    if (Value%10==0)
                        System.out.println();
                    DataHolder.add(FinalValue.toString());
                }
                FinalValue = new StringBuilder();
                Value++;
            }
            DigitHolder.clear();
        }
    }
    static long permutationValue(String d, int limit) {
        long fac1 = 1, fac2 = 1,fac3=1;
        for (int i = 1; i <= d.length(); i++)
        {
            fac1 = fac1 * i;
            if (i <= (d.length() - limit))
                fac2 = fac2 * i;
            if (i <= (limit))
                fac3 = fac3 * i;
        }
        return fac1 / (fac2*fac3);
    }
    /*
    static String CheckForSolve(String input){
        int count=0;
        for (int i=0;i<input.length();i++){
            for (int j=i+1;j<input.length()-1;j++)
            {
                if((int) input.charAt(i) > (int) input.charAt(j))
                    count++;
            }
        }
        if (count%2==0)
        return "Solvable";
        else return "Non-Solvable";
    }*/
}