package org.java_tutorials.dsa.algorithem;

public class DigitAlter
{
    public static void main(String[] args) {
        int n=12354;
        while (n>0){
            int r=n%100;
            if (r>9){
                System.out.print(r%10+""+r/10);
            }
            else {
                System.out.print(r);
            }
            n=n/100;
        }
    }
}
