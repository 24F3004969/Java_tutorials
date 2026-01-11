package org.java_tutorials.tuition.shahir.part_1.class8;

import java.util.Arrays;

public class CountLetter {
    public static void main(String[] args) {
        String s = "Teacher is your best friend";
        char []ar=s.toCharArray();
        Arrays.sort(ar);
        int count=1;
        for (int i = 0; i <ar.length-1; i++) {
            if (ar[i]==ar[i+1]){
                count++;
            }
            else  {
                System.out.println(ar[i]+" is present "+count);
                count=1;
            }
        }
    }
}
