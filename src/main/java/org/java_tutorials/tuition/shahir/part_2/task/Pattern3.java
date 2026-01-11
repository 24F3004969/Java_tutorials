package org.java_tutorials.tuition.shahir.part_2.task;

public class Pattern3
{
    /*
    a a a a a  65 65 65 65 65
    b b b b    66 66 66 66
    c c c      67 67 67
    d d        68 68
    e          69
     */
    public static void main(String[] args) {
        for (int i = 97; i <=101 ; i++) {
            for (int j = i; j <=101 ; j++) {
                System.out.print((char) i+" ");
            }
            System.out.println();
        }
    }
}
