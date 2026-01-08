package org.java_tutorials.part_1.oop;

public class CountCharacter {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for (int i = 1; i <n; i++) {
            if (n%i==0) {
                sum=sum+i;
            }
        }
        if (sum==n) {
                System.out.println("Perfect number");
            }
            else{
                System.out.println("Not a perfect number");
         }
    }
}
