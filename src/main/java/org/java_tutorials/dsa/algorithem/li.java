package org.java_tutorials.dsa.algorithem;

import java.util.*;

public class li {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        /*linkedList.add(0);
        linkedList.add(5);
        linkedList.add(-5);
        linkedList.add(6326);
        linkedList.add(98);
        linkedList.add(69);
        linkedList.add(-69855);
        linkedList.add(-2);
        linkedList.add(-6);
        linkedList.add(-8);
        linkedList.add(5);
        System.out.println(linkedList);
        //Comparator<Integer> comparator= Comparator.reverseOrder();
        //linkedList.sort(comparator);
        Collections.sort(linkedList);
        System.out.println(linkedList);
        System.out.println(new Random().nextInt());*/
        draw_grid();
    }
    static void draw_grid(){
        StringBuilder s=new StringBuilder();
        for(int i=1;i<30;i++){
            for(int j=1;j<50;j++){
                if(i%2!=0 || j%2!=0)
                    s.append("██");
                else
                    s.append("  ");
            }
            s.append('\n');
        }
        System.out.println(s);
    }
}
