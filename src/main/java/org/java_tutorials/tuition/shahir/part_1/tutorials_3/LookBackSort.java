package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

public class LookBackSort {
    public static void main(String[] args) {
        //int []num=randomArray(10); //array
        int []num={-20, 1, 5, 4, -16, 7, 12, 9, 59, 70};
        for (int i = 0; i < num.length-1; i++)
        {
            for (int j = i+1; j >= 1; j--)
            {
                if (num[j]>num[j-1])
                {
                    int temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                }
                else break;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    private static int[] randomArray(int n) {
        int [] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=(int)(Math.random()*i*i+i);
        }
        System.out.println("The array is filled");
        return a;
    }
}
