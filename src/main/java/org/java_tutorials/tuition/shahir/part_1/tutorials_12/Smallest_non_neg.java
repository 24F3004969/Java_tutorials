package org.java_tutorials.tuition.shahir.part_1.tutorials_12;

public class Smallest_non_neg
{
    public static void main(String[] args) {
        int []a={3,5,8,9,56,987,0,4};
        int min=a[0];int i;
        for (i=0;i<a.length;i++){
            min=Math.min(min,a[i]);
            if (min==0){
                System.out.println("No possible non negative integer can be made for the smallest number of the array");
                break;
            }
        }
        if (i<a.length)
            System.out.println(min-1);

    }
}
