package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

public class Curve
{
    public static void main(String []args){
        double x=0,y=0;
        double r=20;
        for (double i = 0; i <=2*r; i++) {
            for (double j = 0; j <=2*r; j++) {
                if (circle(j,i,r))
                System.out.print("*  ");
                else
                    System.out.print("   ");
                x=x+0.5;
            }
            y=y+0.5;
            System.out.println();
        }
    }
    private static boolean circle(double x,double y,double r){
        return (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(r, 2) - 2 * r * (x + y)) <= 0;
    }
}
