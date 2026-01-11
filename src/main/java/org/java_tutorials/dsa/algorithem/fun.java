package org.java_tutorials.dsa.algorithem;

public class fun {
    public  static long fab(long a, long b, long len){
        if (len>=1) System.out.print(fab(b,a+b,len-1)+",");
        return (a+b);

    }
    public static void main(String[] args) {
        System.out.println(fab(0,1,10));
    }
}
