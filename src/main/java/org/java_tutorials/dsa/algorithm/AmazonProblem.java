package org.java_tutorials.dsa.algorithm;

import java.util.Scanner;

public class AmazonProblem {
    public static void main(String[] args) {
        System.out.println("Enter the natural number");
        int number=new Scanner(System.in).nextInt();
        System.out.println(Num_Way(number));
    }

    private static int Num_Way(int number) {
        int way=0;
        for (int i=1;i<=number;i++){
            for (int j=0;j<=number;j++){
                if (((i)+(j*2))==number)
                    way++;
            }
        }
        return way;
    }
}
