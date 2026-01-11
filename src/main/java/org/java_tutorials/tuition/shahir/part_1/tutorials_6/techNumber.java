package org.java_tutorials.tuition.shahir.part_1.tutorials_6;

import java.util.Scanner;

public class techNumber
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a four digit number");
        int n=scanner.nextInt();
        if (String.valueOf(n).length()!=4){
            System.out.println("Not a four digit number");
            System.exit(0);
        }
        int temp=n,sum=0;
        while (n>0){
            sum=sum+(n%100);
            n=n/100;
        }
        if (temp==(int)Math.pow(sum,2))
            System.out.println("Enter number is tech number");
        else
            System.out.println("Enter number is not tech number");
    }
}
