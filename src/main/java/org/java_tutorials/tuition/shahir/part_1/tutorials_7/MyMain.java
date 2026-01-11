package org.java_tutorials.tuition.shahir.part_1.tutorials_7;



public class MyMain
{
   public static void main(String[] args) {
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabeL));
        String c= """
                Helal :125
                Amit  :1258
                Hatif :87545
                """;
       System.out.println(c);
       System.out.println(c.lines().toList());

    }
}
