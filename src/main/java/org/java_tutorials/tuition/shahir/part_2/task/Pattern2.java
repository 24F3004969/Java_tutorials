package org.java_tutorials.tuition.shahir.part_2.task;

public class Pattern2
{
    /*
    A
    A B
    A B C
    A B C D
    A B C D E

    a
    a b
    a b c
    a b c
    a b c d
    a b c d e


    65
    65 66
    65 66 67
    65 66 67 68
    65 66 67 68 69
     */
    public static void main(String[] args) {
        for (int i = 97; i <=101 ; i++)
        {
            for (int j = 97; j <=i; j++)
            {
                System.out.print((char) j+" ");
            }
            System.out.println();
        }
    }
}
