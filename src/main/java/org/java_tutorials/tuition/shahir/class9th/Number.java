package org.java_tutorials.tuition.shahir.class9th;

public class Number {
    public static void main(String[] args) {
        int n=458;
        // 4+5+8=17
        //digit extraction from back
        int i = n;
        while (i >0) {
            int r=i%10;
            System.out.println(r+" ");
            i = i / 10;
        }

    }
}
