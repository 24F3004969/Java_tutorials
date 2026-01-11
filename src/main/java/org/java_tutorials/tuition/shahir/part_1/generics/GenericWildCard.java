package org.java_tutorials.tuition.shahir.part_1.generics;

public class GenericWildCard<T extends Number> {
    private final T[] nums;

    public GenericWildCard(T[] nums) {
        this.nums = nums;
    }

    public double average() {
        double sum = 0.0;
        for (var v : nums) {
            sum = sum + v.doubleValue();
            System.out.println(v.toString());
        }
        return sum / nums.length;
    }

    public boolean isSameAverage(GenericWildCard<?> o) {
        return average() == o.average();
    }
}
    class BoundDemo {
        public static void main(String[] args) {
            var iob = new GenericWildCard<>(new Integer[]{1, 2, 3, 4, 5});

            System.out.println("The average of all elements are = " + iob.average());
            var dob = new GenericWildCard<>(new Double[]{1.0, 2.3, 3.4, 4.5, 5.7});
            System.out.println("The average of all elements are = " + dob.average());
        }
    }
