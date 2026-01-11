package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

public class Pattern_i
{
    public static void main(String[] args) {
        for (int i=9;i>=1;i-=2){
            for (int j=9;j>=i;j-=2)
                System.out.print(j);
            System.out.println();
        }
    }
}
