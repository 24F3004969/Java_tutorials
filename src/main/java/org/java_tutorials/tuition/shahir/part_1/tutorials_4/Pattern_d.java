package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

public class Pattern_d
{
    public static void main(String[] args) {
        for (int i=9;i>=1;i=i-2){
            for (int j=1;j<=i;j=j+2)
                System.out.print(j);
            System.out.println();
        }
    }
}
