package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
4. Create a class to accept a number and check it’s an org.java_tutorials.tutorials_1.Armstrong number or not.
Example 153= 13 +53+33
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int k=n;
        int s=0;
        while(n>0){
            s=s+(int)Math.pow(n%10,3);
            n=n/10;
        }
        if(s==k)
            System.out.println("org.java_tutorials.tutorials_1.Armstrong");
        else
            System.out.println("Not org.java_tutorials.tutorials_1.Armstrong");
    }
}
