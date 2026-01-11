package org.java_tutorials.dsa.util;

import java.util.Objects;

public  class Num<T extends Number> {
    private final T num;

    public Num(T num) {
        this.num = num;
    }


    public Num<?> plus(Num<?> num) {
        if (num.num instanceof Double || this.num instanceof Double) {
            var a = num.num.doubleValue();
            var b = this.num.doubleValue();
            return new Num<>(a + b);
        } else if (num.num instanceof Float || this.num instanceof Float) {
            var a = num.num.floatValue();
            var b = this.num.floatValue();
            return new Num<>(a + b);
        } else if (num.num instanceof Long || this.num instanceof Long) {
            var a = num.num.longValue();
            var b = this.num.longValue();
            return new Num<>(a + b);
        } else if (num.num instanceof Integer || this.num instanceof Integer) {
            var a = num.num.intValue();
            var b = this.num.intValue();
            return new Num<>(a + b);
        } else if (num.num instanceof Short || this.num instanceof Short) {
            var a = num.num.shortValue();
            var b = this.num.shortValue();
            return new Num<>(a + b);
        } else if (num.num instanceof Byte || this.num instanceof Byte) {
            var a = num.num.byteValue();
            var b = this.num.byteValue();
            return new Num<>(a + b);
        }
        return new Num<Number>(0);
    }

    public Num<?> minus(Num<?> num) {
        return num.plus(this.multiply(new Num<>(-1)));
    }

    public Num<?> multiply(Num<?> num) {
        if (num.num instanceof Double || this.num instanceof Double) {
            var a = num.num.doubleValue();
            var b = this.num.doubleValue();
            return new Num<>(a * b);
        } else if (num.num instanceof Float || this.num instanceof Float) {
            var a = num.num.floatValue();
            var b = this.num.floatValue();
            return new Num<>(a * b);
        } else if (num.num instanceof Long || this.num instanceof Long) {
            var a = num.num.longValue();
            var b = this.num.longValue();
            return new Num<>(a * b);
        } else if (num.num instanceof Integer || this.num instanceof Integer) {
            var a = num.num.intValue();
            var b = this.num.intValue();
            return new Num<>(a * b);
        } else if (num.num instanceof Short || this.num instanceof Short) {
            var a = num.num.shortValue();
            var b = this.num.shortValue();
            return new Num<>(a * b);
        } else if (num.num instanceof Byte || this.num instanceof Byte) {
            var a = num.num.byteValue();
            var b = this.num.byteValue();
            return new Num<>(a * b);
        }
        return new Num<Number>(0);
    }

    public static void main(String[] args) {
        var c = new Num<>(5.0);
        System.out.println(c.plus(new Num<>(45)));
    }

    public T num() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Num) obj;
        return Objects.equals(this.num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public String toString() {
        return "Num[" +
                "num=" + num + ']';
    }

}
