package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

public class Loop_a
{
    //pg 209 q17
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                if (j%2==0)
                    System.out.print("#");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
