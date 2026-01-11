package org.java_tutorials.dsa.algorithm;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args, Scanner scanner) {
        System.out.println("Enter the total number of gene to enter");
        int n = scanner.nextInt();
        String[] gene = new String[n];
        int[] health = new int[n];
        System.out.println("Enter the gene codes and their health");
        for (int r = 0; r <n; r++) {
            gene[r] = new Scanner(System.in).nextLine();
        }
        System.out.println("Enter the gene codes and their health");
        for (int i = 0; i < n; i++) {
            health[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Enter the number of DNA stands");
        int stand = new Scanner(System.in).nextInt();
        String[] DNACode = new String[stand];
        int healthPoint = 0;
        for (int i = 0; i < stand; i++)
        {
            System.out.println("Enter the main.java.org.jmath.tutorials_3 for dna");
            String c = new Scanner(System.in).nextLine(), sub = "";
            DNACode[i] = c;
            System.out.println("Enter the start point of healthy gene");
            int start = new Scanner(System.in).nextInt();
            System.out.println("Enter the end point of healthy gene");
            int end = new Scanner(System.in).nextInt();
            for (int k = 1; k <=c.length(); k++)
            {
                for (int l = 0; l <=c.length()-k ; l++)
                {
                    sub = c.substring(l, l+k);
                    for (int j = start; j <=end; j++)
                    {
                        if (sub.equals(gene[j]))
                            healthPoint = healthPoint + health[j];
                    }
                }
            }
            System.out.println(healthPoint);
        }
    }
}
