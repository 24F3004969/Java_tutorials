package org.java_tutorials.part_1.util;

import java.util.Scanner;

public class SelectionSortExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the 10 elements in the array");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
