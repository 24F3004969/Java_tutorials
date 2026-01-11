package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

import java.util.*;

class hello
{
    public static void main(String[] args)
    {

        /*
       int dice_no=(int)(Math.random()*6+1);
        System.out.println(Math.random());
        System.out.println(dice_no);
        */
        Scanner i=new Scanner(System.in);
        System.out.println("Enter a 3 digits number");
        int n=i.nextInt();
        int l=n%10;
        n=n/10;
        int m=n%10;
        n=n/10;
        int f=n%10;
        System.out.println(f);
        System.out.println(m);
        System.out.println(l);
    }
}