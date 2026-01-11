 package org.java_tutorials.dsa.util;

import java.lang.reflect.InvocationTargetException;

/**
 * @author hilal on 28-02-2023
 * @project Java_tutorials
 */
public class Triangle {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*ClassLoader classLoader=new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }
        };
        Parcel r=(Parcel) classLoader.loadClass("main.java.org.jmath.util.D").getDeclaredConstructor().newInstance();
        r.calculate();*/
        long a = System.currentTimeMillis();
        _generatePythagorean_triplet(3, 20000000);
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void _generatePythagorean_triplet(int start, int end) {
        int m = (start - 1) / 2;
        int n = m + 1;
        int a, b, c;
        int cr = 0;
        while ((n * n + m * m) <= end) {
            int i = n;
            for (; (m * m + i * i) <= end; i++) {
                a = i * i - m * m;
                b = 2 * m * i;
                c = m * m + i * i;
                int k = 1;
                if (Cfactor(a, b, c) == 1) {
                    while (c * k <= end) {
                        k += 1;
                        cr++;
                    }
                }
            }
            m = m + 1;
            n = n + 1;
        }
        System.out.println("Number of Pythagorean triplet " + cr);
    }

    private static int Cfactor(int... a) {
        return getHCF(getHCF(a[0], a[1]), a[2]);
    }

    private static int getHCF(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while (max % min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return min;
    }
}

