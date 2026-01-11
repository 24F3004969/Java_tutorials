package org.java_tutorials.tuition.shahir.part_1.class8;

public class Printer {
    Printer(){
        System.out.println("I was called 😎😎");
    }
    void print()
    {
        System.out.println("I was called");
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        //p.print();
        p.print();
    }
}
