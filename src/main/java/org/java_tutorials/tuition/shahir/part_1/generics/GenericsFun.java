package org.java_tutorials.tuition.shahir.part_1.generics;

public class GenericsFun {
    public static <T> Tuples<T> swap(T val1, T val2) {
        return new Tuples<>(val2, val1);
    }

    public static void main(String[] args) {
        var t = swap(5, "Helal anwar");
        System.out.println(t);
        System.out.println(t.value1());
    }
}

record Tuples<T>(T value1, T value2) {}
