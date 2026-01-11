package org.java_tutorials.dsa.algorithm;

public class circle {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            for (int j = 0; j <=50 ; j++) {
                if (j>value(2,i)&&j<=cord(2,i))
                    System.out.print(" . ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static  int value(int r,int i){
        return (int) Math.round((r-Math.sqrt(r*r-((r-i)*(r-i)))));
    }
    public static int cord(int r,int i){
        return (int) Math.round(2*(Math.sqrt(r*r-((r-i)*(r-i)))));
    }
}
