package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

/*
9. Write a program to enter three sides of a triangle and check whether is PYTHOGORIAN TRIPLATE or
not
Example:
Input: 3, 4, 5
Reason: 52=32+42
Output: PYTHOGORIAN TRIPLATE
 */
public class Triangle
{
    public static void main(String[] args) {
        long c=System.currentTimeMillis();
        PYTHOGORIAN_TRIPLATE(20);
        System.out.println(System.currentTimeMillis()-c);
    }
    public static void PYTHOGORIAN_TRIPLATE(int n){
        int ct=0;
        for (int i = 3; i <=n ; i++) {
            for (int j = i+1; j <=n ; j++) {
                for (int k = j+1; k <=n ; k++) {
                    if (i*i+j*j==k*k){
                        System.out.println(i+" "+j+" "+k);
                        ct++;
                    }
                }
            }
        }
        System.out.println(ct);
    }
}
