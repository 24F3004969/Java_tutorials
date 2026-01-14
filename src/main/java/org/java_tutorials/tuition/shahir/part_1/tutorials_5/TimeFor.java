package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

import java.util.*;

import static org.java_tutorials.dsa.util.Util.println;

public class TimeFor {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(new HashSet<>());
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        linkedList.add(90);
        for (int i = 0; i < 10; i++) {
           linkedList.pop();
           linkedList.add(i);
            println(linkedList);
        }
    }
}
