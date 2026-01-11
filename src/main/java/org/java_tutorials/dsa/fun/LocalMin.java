package org.java_tutorials.dsa.fun;


public class LocalMin {
    public static void main(String []args) {
        int[] a = {112, 15, 3, 4, 5, 1, 7, 9};
        int lb = 0, ub = a.length - 1, mid;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (((mid == 0) || (a[mid] <= a[mid - 1])) &&
                    ((mid == a.length - 1) || (a[mid] <= a[mid + 1]))) {
                System.out.println(a[mid] + " found at index " + mid);
                break;
            } else if (a[mid] > a[mid - 1])
                ub = mid - 1;
            else if (mid < a.length - 1 && a[mid] > a[mid + 1])
                lb = mid + 1;
        }
    }
}