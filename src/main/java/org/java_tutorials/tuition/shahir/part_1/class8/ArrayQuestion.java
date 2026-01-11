package org.java_tutorials.tuition.shahir.part_1.class8;

public class ArrayQuestion {
    public static void main(String[] args) {
        int[] a = {2, 23, -9, 56, 78};
        int p=13;
        ArrayQuestion q=new ArrayQuestion();
        for (int i = 0; i <5; i++) {
            System.out.print(a[i]+"   ");
        }
        q.arr(a);
        System.out.println();
        for (int i = 0; i <5; i++) {
            System.out.print(a[i]+"   ");
        }
        System.out.println();
        String n="Anwar";
        System.out.println(n);
        q.name(n);
        System.out.println(n);

    }
    void name(String s){
        s="Hilal";
    }
    void arr(int []b){
        b[0]=5;
    }
    void ab(int a){
        a=10;
        System.out.println("The value of a = "+a);
    }
}
