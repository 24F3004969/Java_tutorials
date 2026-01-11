package org.java_tutorials.tuition.shahir.part_1.tutorials_12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaxCalc
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int dependents = inputInt("Enter number of dependents: ", keyboard);

        int pigs = inputInt("Enter number of pigs: ", keyboard);

        double oinks= inputInt("Enter number of oinks: ", keyboard) -(pigs*500)+(200*dependents);

        System.out.println("Oinks after rewards: " + oinks);

        if(oinks<10000) oinks -= oinks*0.02; //2% tax
        else if(oinks<5000) oinks -= oinks*0.1; //10% tax
        else oinks -= oinks*0.2; //20% tax
        System.out.println("Oinks after penalties: " + oinks);
    }

    private static int inputInt(String prompt, Scanner keyboard){
        System.out.print(prompt);
        try{
            return keyboard.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Input Mismatch! Please enter Num");
            keyboard.next();
            return inputInt(prompt, keyboard);
        }
    }

}
