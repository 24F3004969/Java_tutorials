package org.java_tutorials.dsa.algorithem;

import java.util.ArrayList;
import java.util.Scanner;

public class KickStart {
    public static void main(String[] args) {
        int group = 0, score = 0;
        String prefix_1, prefix_2;
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> ho = new ArrayList<>();
        ArrayList<Integer> it = new ArrayList<>();
        System.out.println("Enter the number of elements");
        int size = new Scanner(System.in).nextInt();
        System.out.println("Enter the elements one by one up to the number of elements entered above");
        for (int x = 0; x < size; x++) a.add(new Scanner(System.in).nextLine());
        System.out.println("Enter the group size");
        int gSize = new Scanner(System.in).nextInt();
        for (String x : a) group = Math.max(group, x.length());
        for (int k = group; k >= 1; k--) {
            for (int i = 0; i < a.size(); i++) {
                for (var j = 0; j < a.size(); j++) {
                    if (a.get(i).length() >= k && a.get(j).length() >= k) {
                        prefix_1 = a.get(i).substring(0, k);
                        prefix_2 = a.get(j).substring(0, k);
                        if ((i != j) && prefix_1.equalsIgnoreCase(prefix_2)) {
                            if ((!ho.contains(a.get(i)) || !it.contains(i)) && ho.size() < gSize) {
                                ho.add(a.get(i));
                                it.add(i);
                            }
                            if ((!ho.contains(a.get(j)) || !it.contains(j)) && ho.size() < gSize) {
                                ho.add(a.get(j));
                                it.add(j);
                            }
                        }
                    }
                }
            }
            if (gSize == ho.size()) {
                for (String s : ho)
                    a.remove(s);
                System.out.println("Score  " + k);
                score = score + k;
                System.out.println(ho);
            }
            ho.clear();
            it.clear();
        }
        System.out.println("Total score of DataStructure.Pip is  " + score);
    }
}