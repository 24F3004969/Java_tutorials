package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

public class part {
    public static void main(String[] args) {
        System.out.println(pow(2,0));
       /* var main.java.org.jmath.tutorials_14 = new Complex(1, 1);
        System.out.println(main.java.org.jmath.tutorials_14.division(new Complex(3, 2)));
        System.out.println(main.java.org.jmath.tutorials_14.product(new Complex(3, 2)));
        System.out.println(main.java.org.jmath.tutorials_14.add(new Complex(3, 2)));
        System.out.println(main.java.org.jmath.tutorials_14.subtract(new Complex(3, 2)));
        System.out.println(main.java.org.jmath.tutorials_14.modulus());
        System.out.println(main.java.org.jmath.tutorials_14.conjugate());
        System.out.println(main.java.org.jmath.tutorials_14.argument());
        System.out.println(main.java.org.jmath.tutorials_14.add(main.java.org.jmath.tutorials_14.conjugate()));

        main.java.org.jmath.tutorials_14 = main.java.org.jmath.tutorials_14.
                add(main.java.org.jmath.tutorials_14).
                division(main.java.org.jmath.tutorials_14).
                inverse().
                conjugate().
                pow(3);
        System.out.println(main.java.org.jmath.tutorials_14);
        System.out.println(Arrays.deepToString(multiply(random_array(500),random_array(500))));*/
    }
    public static int [][] multiply(int [][]a,int [][]b){
        int [][] c=new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            int []k=a[i];
            for (int j = 0; j < b[0].length; j++) {
                int []p=b[j];
                int sum=0;
                for (int l = 0; l < p.length; l++) {
                    sum=sum+(p[l]*k[l]);
                }
                c[i][j]=sum;
            }
        }
        return c;
    }
    static int [][] random_array(int size){
        int [][]c=new int [size][size];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
            c[i][j]=(int)(Math.random()*9+1);
            }
        }
        return c;
    }
    public static double pow(double x,int p) {
        var v = 1.0;
        var k = x;
        if (p >= 1)
            while (p >= 1) {
                if (p % 2 == 0) {
                    k *= k;
                    p /= 2;
                } else {
                    v *= k;
                    p--;
                }
            }
        return v;
    }
}
