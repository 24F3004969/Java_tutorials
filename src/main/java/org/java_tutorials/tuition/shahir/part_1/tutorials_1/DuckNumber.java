package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
5.Create a class to accept a number and check whether it’s a duck number or not.
Example : 604 – duck number 78- not duck number
 */
public class DuckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int s=0;
        while(n>0)
        {
            if(n%10==0){
               s=1;
               break;
            }
            n=n/10;
        }
        if(s==1)
            System.out.println("DuckNumber");
        else
            System.out.println("Not DuckNumber");
    }
}
