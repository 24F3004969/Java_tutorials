package org.java_tutorials.dsa.util;
class Output
{
    public static void main(String args[])
    {
        int a=12, b=13,c;
        c=a++ + ++a/7 + b++;
        System.out.println(a+"\t"+b+"\t"+c);
        c=++a + a++/3 + ++b;
        System.out.println(a+"\t"+b+"\t"+c);
    }
}

