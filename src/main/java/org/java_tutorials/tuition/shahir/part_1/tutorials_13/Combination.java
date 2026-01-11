package org.java_tutorials.tuition.shahir.part_1.tutorials_13;


import java.util.ArrayList;
import java.util.TreeSet;

public class Combination {
    public static void main(String[] args) {
        /*var m = new int[]{1, 2, 3, 4, 5, 6};
        var list = new ArrayList<Integer>();
        var l = new int[3];
        combination(0, 4, m, list, 0, l);
        System.out.println(list);
        System.out.println(list.size());
        var lst = new TreeSet<Integer>();
        combination(0, 2, m, lst, 1, 0);
        System.out.println(lst);
        System.out.println(lst.size());*/
        int[]a={1, 2, 3, 4, 5, 6};
        combination(a,0,2,1,0);
    }

    static void combination(int startIndex, int digits, int[] memory, ArrayList<Integer> listOfNumbers, int count, int[] val) {
        for (int i = startIndex; i < memory.length; i++) {
            if (count < digits - 1) {
                val[count] = memory[i];
                count++;
                combination(i + 1, digits, memory, listOfNumbers, count, val);
                count--;
            } else {
                int number = 0;
                for (int j = 0; j < val.length; j++) {
                    int k = val[j];
                    number = number + k * (int) (Math.pow(10, val.length - j));
                }
                number = number + memory[i];
                listOfNumbers.add(number);
            }

        }
    }

    static void combination(int i, int digits, int[] list, TreeSet<Integer> listOfNumbers, int count, int number) {
        for (; i < list.length; i++) {
            if (count < digits) {
                number = number * 10 + list[i];
                count++;
                combination(i + 1, digits, list, listOfNumbers, count, number);
                count--;
                number = number / 10;
            } else {
                listOfNumbers.add(number * 10 + list[i]);
            }

        }
    }
    static void combination(int []list,int i, int digits,int count, int number) {
        for (; i < list.length; i++) {
            if (count < digits) {
                number = number * 10 + list[i];
                count++;
                combination(list,i + 1, digits,count, number);
                count--;
                number = number / 10;
            } else {
                System.out.printf("%d , ",number * 10 + list[i]);
            }
        }
    }
}
