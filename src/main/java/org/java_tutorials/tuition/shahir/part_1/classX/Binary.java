package org.java_tutorials.tuition.shahir.part_1.classX;


import java.util.*;

public class Binary {
    public static void main(String[] args) {
        String[] a = {"Aamish", "Sadiya", "Hanifa", "Helal", "Zaid", "Faiz"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Enter 10 name");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name to  be searched");
        String n = in.nextLine();
        int c = 0;
        int lb = 0, up = a.length - 1, mid;
        while (lb <= up) {
            mid = (lb + up) / 2;
            if (a[mid].equals(n)) {
                c = 1;
                break;
            } else if (n.compareTo(a[mid]) > 0)
                lb = mid + 1;
            else if (n.compareTo(a[mid]) < 0)
                up = mid - 1;
        }
        if (c == 1)
            System.out.println("Name is present");
        else
            System.out.println("Name is not present");
    }
}
