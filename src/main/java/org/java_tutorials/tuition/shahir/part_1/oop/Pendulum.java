package org.java_tutorials.tuition.shahir.part_1.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Pendulum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        System.out.println("Enter the elements of the arrays");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        var _arr = new int[size];
        int mid = size / 2;
        _arr[mid] = arr[0];
        _arr[0] = size % 2 % 2 == 0 ? arr[size - 1] : 0;
        int k = 1;
        for (int i = 1; i < size - 1; i = i + 2) {
            _arr[mid - k] = arr[i];
            _arr[mid + k] = arr[i + 1];
            k++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(_arr));
    }
}
