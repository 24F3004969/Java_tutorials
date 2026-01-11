package org.java_tutorials.tuition.shahir.part_1.classX;

public class String2 {
    public static void main(String[] args) {
        String s="Yushra";
        String t="Yhamim";
        String z="Warda Shoaib";
        System.out.println(s.length());
        System.out.println(s.concat(t).length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(t.charAt(4));
        System.out.println(s.equalsIgnoreCase((s.toLowerCase())));
        System.out.println(s.compareTo(t));
        System.out.println(s.substring(3));
        System.out.println(s.indexOf('s')+s.indexOf('k'));
        System.out.println(z.indexOf('a',2));
        System.out.println(z.startsWith("W"));
        System.out.println(z.replace("ar","z"));

    }
}
