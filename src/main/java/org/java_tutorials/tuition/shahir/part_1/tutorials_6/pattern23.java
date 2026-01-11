package org.java_tutorials.tuition.shahir.part_1.tutorials_6;

public class pattern23
{
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=i;j<=5;j++)
                System.out.print("*".indent(i-1));
            //System.out.println();
        }
    }
}
