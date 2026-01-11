package org.java_tutorials.dsa.util;

import java.util.Objects;

public final class ArraysEquality {
    private final int[] list;

    public ArraysEquality(int... list) {
        this.list = list;
    }

    public static void main(String[] args) {
        var a = new ArraysEquality(4, 6, -4, -3, 8);
        var b = new ArraysEquality(6, 4, 8, -3, -4);
        System.out.println(a.equals(b));
    }

    public int[] list() {
        return list;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ArraysEquality) obj;
        return Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "ArraysEquality[" +
                "list=" + list + ']';
    }

}
