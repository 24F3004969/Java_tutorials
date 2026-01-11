package org.java_tutorials.tuition.shahir.part_1.oop;

public class WaterDrop {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

    }

    void countWaterDrops(int[] arr) {
        int i = 0;
        i = arr[0] == 0 ? i + 1 : 0;
        while (i < arr.length) {
            int val = arr[i];
            int j=i+1;
            while (j < 10) {
                 if(arr[j]>arr[i]){

                 }
                 else {

                 }
                j++;
            }
            i++;
        }
    }
}
