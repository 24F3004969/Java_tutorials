package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

public class Yusuf {
    public static void main(String[] args) {
        Yusuf y=new Yusuf();
        Yusuf y1=new Yusuf();
        System.out.println(y+"\t"+y1);
        y.sum(5,9);
        y.difference(5,9);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void difference(int a,int b){
        System.out.println(a-b);
    }
    int difference(int a){
        return a;
    }
}
