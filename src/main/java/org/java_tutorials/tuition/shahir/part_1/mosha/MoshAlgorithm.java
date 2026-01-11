package org.java_tutorials.tuition.shahir.part_1.mosha;

import java.util.LinkedList;

public class MoshAlgorithm {

    public static LinkedList<Integer> find_sum(LinkedList<Integer> a) {
        while (a.size() > 2) {
            for (int i = 0; i < a.size() - 1; ) {
                int z = a.pollLast();
                int m = a.get(i) + z;
                if (m > 9) {
                    a.set(i, m / 10);
                    a.add(i + 1, m % 10);
                    i = i + 2;
                } else {
                    a.set(i, m % 10);
                    i++;
                }

            }
        }
        return a;

    }

    private static LinkedList<Integer> charFrequency(String str) {
        LinkedList<Integer> list = new LinkedList<>();
        int m = 0;
        for (int i = 0; i < str.length(); ) {
            int count = 0;
            char z = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == z)
                    count++;
            }
            if (count > 1) {
                if (count <= 9)
                    list.add(count);
                else {
                    list.add(count % 10);
                    list.add(count / 10);
                }
            } else {
                m++;
            }
            if (count > 1)
                str = str.replace("" + z, "");
            else i++;

        }
        for (int i = 1; i <= m; i++) {
            list.add(1);
        }
        return list;
    }

    public static String mosh_love_algorithm(String name1, String name2) {
        name1 = name1.replace(" ", "");
        name2 = name2.replace(" ", "");
        String lovers = name1.concat(name2);
        lovers = lovers.toLowerCase();
        var z = find_sum(charFrequency(lovers));

        return "Love between " + name1 + " and " + name2 + " is = " + z.get(0) + z.get(1) + "%";

    }

    public static void main(String[] args) {
        System.out.println(mosh_love_algorithm("python","java"));
    }
}
