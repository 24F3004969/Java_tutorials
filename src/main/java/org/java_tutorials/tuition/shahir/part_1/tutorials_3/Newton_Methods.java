package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

public class Newton_Methods {
    public static void main(String[] args) {
        System.out.println(sqrt(Double.MAX_VALUE));
        System.out.println(Math.pow(Math.E, 3.3051833194862227E-7));
        System.out.println(n_root(Math.E, Double.MAX_VALUE));
    }

    static double sqrt(double number) {
        double sqrt = (number + 1) / 2;
        double tem = 0;
        int k = 0;
        while (tem != sqrt) {
            tem = sqrt;
            k++;
            sqrt = (number / tem + tem) / 2;
        }
        System.out.println(sqrt);
        return sqrt;
    }

    static double n_root(double number, double power) {
        //System.out.println(number+"    "+power);
        double sqrt = (number + power - 1) / power;
        //System.out.println(sqrt);
        double tem = 0;
        while (tem != sqrt) {
            tem = sqrt;
            sqrt = (number / Math.pow(tem, power - 1) + tem * (power - 1)) / power;
           System.out.println(sqrt);
        }
        //System.out.println(k);
        return sqrt;
    }
}
