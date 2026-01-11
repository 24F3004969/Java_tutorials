package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;
// page 209 q 2
public class Prime
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0,c=0;
        for (int i=1;i<=20;i++){
            System.out.println("Enter the "+i+" number");
            int n=scanner.nextInt();
            for (int j=1;j<=n;j++){
                if (n%j==0)
                    count++;
            }
            if (count==2){
                c++;
                count=0;
            }
        }
        System.out.println("Number of prime number in the following number :"+c);
    }
}
