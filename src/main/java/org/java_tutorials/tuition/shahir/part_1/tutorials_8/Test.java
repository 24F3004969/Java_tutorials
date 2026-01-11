package org.java_tutorials.tuition.shahir.part_1.tutorials_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test
{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\p{ASCII}\\p{Punct}\\p{ASCII}");
        Matcher m = p.matcher("a/b");
        boolean b = m.matches();
        System.out.println(b);
        System.out.println();
    }
}
