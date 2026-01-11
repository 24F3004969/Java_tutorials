package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
My approach to solve this problem:
     # First i ask the user to enter the data in string format
     #Then i ask the number of elements for the data that he/she want to permuted(because every it is not necessary to permute the full elements)
     #Then i find the permutations using the method permutationValue.
 */
public class Number
{
    public static void main(String[] args)
    {
        double Value = 1.0;
        int Size = 0;
        Scanner in = new Scanner(System.in);
        StringBuilder FinalValue = new StringBuilder();
        LinkedList<Integer> DigitHolder = new LinkedList<>();
        HashSet<String> NumberHolder = new HashSet<>();
        HashSet<String> DataHolder = new HashSet<>();
        System.out.println("Enter your Data");
        String Data = in.nextLine();
        List<Integer> list;
        System.out.println(Data.length());
        System.out.println("Enter the number of Element you want to choose from your data");
        int SizeLimit = in.nextInt();
        long start=System.currentTimeMillis();
        double end=permutationValue(Data, SizeLimit);
        System.out.println(end);
        while (Value <= end)
         {
             Size = 1;
             List<Integer> result;
             int bound = Data.length();
             result = IntStream.range(0, bound).boxed().collect(Collectors.toList());
             list= result;
            while (Size <= SizeLimit) {
                int digit = (int) (Math.random() * list.size());
                DigitHolder.add(list.get(digit));
                list.remove(digit);
                Size++;
            }
            if (!NumberHolder.contains(DigitHolder.toString()))
            {
                NumberHolder.add(DigitHolder.toString());
                for (int j = 0; j < SizeLimit; j++) {
                    FinalValue.append(Data.charAt(DigitHolder.get(j)));
                }

                if (!DataHolder.contains(FinalValue.toString())) {
                    //System.out.print(FinalValue+"   ");
                    /*if (Value%10==0)
                        System.out.println();*/
                    DataHolder.add(FinalValue.toString());
                }
                FinalValue = new StringBuilder();
                Value++;
            }
            DigitHolder.clear();
        }
        System.out.println(System.currentTimeMillis()-start);
    }
    static double permutationValue(String d, int limit) {
        double fac1 = 1, fac2 = 1;
        for (int i = 1; i <= d.length(); i++) {
            fac1 = fac1 * i;
            if (i <= (d.length() - limit))
                fac2 = fac2 * i;
        }
        return fac1 / fac2;
    }
}