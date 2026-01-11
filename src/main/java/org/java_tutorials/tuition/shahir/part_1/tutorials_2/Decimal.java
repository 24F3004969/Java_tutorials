package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

public class Decimal
{
    public static void main(String[] args) {
        System.out.println(no_of_digit_before_decimal(18.36));
    }
    static int no_of_digit_before_decimal(double x){
        System.out.println(x);
        int c=0;

        while (x-(long)x!=0.0&&(Math.round(x/(x-(long)x))==1)){
            System.out.println(x+"  "+(long)x);
            c++;
            x=x*10;
        }
        return c;
    }
}
