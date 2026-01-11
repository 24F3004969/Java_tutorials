package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

public class arrayQuickSort {
    public static void main(String[] args) {
        int[] x = randomArray(1000000);
        sort(x);
    }

    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = (int) (Math.random() * n);
        }
        System.out.println("Array is filled");
        return a;
    }

    private static void sort(int[] a) {
        int [][]points={new int[]{0, a.length - 1}};
       for(int j=0;j<points.length;j++){
            int[] k = points[j];
            int start = k[0];
            int end = k[1];
            int pivot = k[1];
            for (int i = start; i < pivot; ) {
                if (a[pivot] < a[i]) {
                    int temp1 = a[pivot];
                    int temp2 = a[pivot - 1];
                    a[pivot] = a[i];
                    a[i] = temp2;
                    a[pivot - 1] = temp1;
                    pivot--;
                } else i++;
            }
            if (pivot - start >= 2) {
                    points=addElement(points,new int[]{start, pivot - 1});
            }
            if (end - pivot >= 2) {
                points=addElement(points,new int[]{pivot + 1, end});

            }
        }
        System.out.println("Sorted");
    }
    private static int[][] addElement(int [][]arr,int []element){

        int [][] newArray =new int[arr.length+1][];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        newArray[arr.length]=element;
        return newArray;
    }
    private static int[][] removeZeroIndex(int [][]arr){
        int [][]newArray=new int[arr.length-1][];
        System.arraycopy(arr, 1, newArray, 0, arr.length - 1);
        return newArray;
    }
}

