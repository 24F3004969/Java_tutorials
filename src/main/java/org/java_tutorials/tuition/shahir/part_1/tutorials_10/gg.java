package org.java_tutorials.tuition.shahir.part_1.tutorials_10;

import java.util.ArrayList;

public class gg
{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList1=new ArrayList<>();
        for(int a=0;a<10;a++)
            arrayList.add(a);
        for(int i=40;i<50;i++)
            arrayList1.add(i);
        arrayList=arrayList1;
        System.out.println(arrayList);


    }
}
