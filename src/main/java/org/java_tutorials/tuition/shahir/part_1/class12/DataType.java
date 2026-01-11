package org.java_tutorials.tuition.shahir.part_1.class12;

import java.util.Arrays;

public class DataType {
    public static void main(String[] args) {
        String s = new String("Java");
        User u1 = new User("mosha", 18, "F");
        User u2 = new User("Amena", 18, "F");
        User u3 = new User("Hilal", 25, "M");
        User u4 = u3;
        u4.name = "Atif";
        System.out.println(u3);
        System.out.println(u4);
        User u[] = new User[5];
        u[0] = u1;
        u[1] = u2;
        int a[] = {8, 7, 6, 5, 12};
        System.out.println(Arrays.toString(a));
        int b[]=a;
        b[0]=45;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
